from __future__ import print_function
import json



def find_values(id, json_repr):
    results = []

    def _decode_dict(a_dict):
        try:
            results.append(a_dict[id])
        except KeyError:
            pass
        return a_dict

    json.loads(json_repr, object_hook=_decode_dict) # Return value ignored.
    return results
              
json_repr = '{"0": {"Patente": "AAAA000"}, "1": {"Patente": "AAAA001"}, "2": {"P3": "AAAA002"} }'

searchWord = input("Por favor ingrese el id a buscar: ")
searchWord = str(searchWord)

print(find_values(searchWord, json_repr))

