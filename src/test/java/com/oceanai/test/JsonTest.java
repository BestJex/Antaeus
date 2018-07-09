package com.oceanai.test;

import com.google.gson.Gson;
import com.oceanai.model.SearchBean;

public class JsonTest {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = "{\"base6\":\"\\/9j\\/2wBDAAgGBgcGBQgHBwcJCQgKDBQNDAsLDBkSEw8UHRofHh0aHBwgJC4nICIsIxwcKDcpLDAx\\r\\nNDQ0Hyc5PTgyPC4zNDL\\/2wBDAQkJCQwLDBgNDRgyIRwhMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIy\\r\\nMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjL\\/wAAUCADAAJAEASIAAhEBAxEBBCIA\\/8QAHwAAAQUB\\r\\nAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL\\/8QAtRAAAgEDAwIEAwUFBAQAAAF9AQIDAAQRBRIhMUEG\\r\\nE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3ODk6Q0RFRkdISUpTVFVW\\r\\nV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWmp6ipqrKztLW2t7i5usLD\\r\\nxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6\\/8QAHwEAAwEBAQEBAQEBAQAAAAAA\\r\\nAAECAwQFBgcICQoL\\/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSExBhJBUQdhcRMiMoEIFEKR\\r\\nobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElKU1RVVldYWVpjZGVmZ2hp\\r\\nanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU\\r\\n1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6\\/9oADgQBAAIRAxEEAAA\\/AO4XG93KnYuWwOwFeJ+KPH99\\r\\nrMn+gST6ciEgCKUjzB717Fqt5Dpnh3UL6abykjhb5++SMDHvnFfODtvjXjimgPf6KKKguriS8m8y\\r\\n4IZ9vLKoXP1xxVarEv3FIqv1pAFFFFC5JqRR6moskcZooAKKKKkzSkjNMzS0AFFFFAwG9qUdKTHv\\r\\nSUDCiiirEC5YLV22DISAM5GDWeh2vxV22n8mXzGBZe4pgFFFFMuLQRrl93lvnBxXqfwe1e0msbvw\\r\\n+93K91G5nto5OBswNwX6HnHvn1rjWhTUNJkhjPC\\/vYj7+lZfhjVv+Ee8W6bqpcJHFKBKxBI8tvlb\\r\\nj6E0MAooor6PCfvWUtwOtO2kgBMUkzxoSFy+7kMOnNRqCFOTjHb1pCCiiipzkYGOB3pvmlyWZcYO\\r\\nBUZeT5S2SB26Cn+YMN8hx70gCiiivPvi\\/ePB4b0ewjbbHezM8pz1CYwPzOfwryeUqoULzXq\\/xltQ\\r\\n\\/g\\/SbxVO62vDFn2dST+qivHopV+UyAkDnFUgCiiikm6AVXqxM4dt3T2pBCvUt+AFABRRRVakqw0a\\r\\nheAc1HtpDsFFFFMFOwaUDmn9eaBoKKKKaRSfw++afijbQAUUUUgJq9HH5sZ29Qarxxb2wK63QtAe\\r\\n5S4XaVnXDbH4OKV7FqIUUUVT0yWSxaJsAxMcfjWNqlqFubiONCsOcp7D\\/wCtXW67otxpEcbj5o35\\r\\nDY6NWRexme3W4wA2MMo6U1K5Li0FFFFe66LeR6l4W0jUYQ6pLbLw\\/Xcowc\\/iKuKyhSWPpziqmhxp\\r\\nb+FNFjjjKILSNtpPTIBP61dIBPPrxSICiiilaNdgLtuPZfSpGhwmCDjHY1FGZCsjCP5e5PahpCVy\\r\\n+So\\/u0AFFFFc18SYBd\\/C7VcqCYHilX2O9Qf0Jr56UkqM19STWP8AauiappTYH2y0kiXI\\/iKkA\\/h1\\r\\nr5aQFcqwwynBB7UxoKKKKk681dtzlQAB71TXla1LGLMZP0qZSsi4RuFFFFMMG7nFRmzJPAreW1H2\\r\\nccfMTViKx3FVAHNY+1N\\/ZhRRRXL\\/AGNs9OvSnfYpOm2u0j0nBPyj29qnTQy75xyRT9qCpoKKKK4a\\r\\nKwmkk2BCWPYda04vDt3KxxBwgycmu+0\\/w99ncuUXLADI6ityx0rbl3Vee3tR7Rj5UFFFFcl4P8GC\\r\\naV72VNyr8oX3r0W00KGO6SSOFQ2NrN3K+571s6XBFFYRrGiopGSAO9XVQDJHeplIaQUUUVkar4et\\r\\n9W0eXTmUBtvyP6Hsa8P1KD7Da3cFypieLKnPY9P519D\\/AHTxXmXxc0WBfCM+pRRbZRcoHYdwT3\\/H\\r\\nFKnLUUooKKKK7m2gnt\\/Cegu0GU+wwLuBHLFM49egzSDP3169qYt5Lc6focKuRbppVtOqD+JmGPxw\\r\\nF\\/X3qRDs6jpziulM5ZKwUUUULI7JtOdgPAIoZ1cgHkipB5hTdj32io0cu33SN3tQSFFFFLbyGC4V\\r\\n+4rwH4laENB8c3axR7La8\\/0mH0+b7wH0bP4Yr2jxR4gTwv4Wl1f7OtxOXEMEbcKXPc+wAJry7xL4\\r\\nrk8ZaRBZeIdOgsL+2cyW97bKShUjlGGTjOPXqB+JcqKfQKKKK4KMVs6dwijFZViBLIqHjNbkEPlq\\r\\nB6c1lUehtBBRRRWnEfl21q6egJGe9Y0Z+YGtnT5BvxXMdAUUUVtxRAsPStCOBQd2KqLjjb6VrW0X\\r\\nmRDnmqQBRRRVuAIY8qMGrUfJFQQRlFxUqhlbJOR2piCiiitqzlAXZV0Ek1lWkqhuSOlaC3Uat85A\\r\\nX1Jp2uK9goooqVgQM1zfjq1bUPh3rkCJudY0kA\\/3XBP6CrF1450+OdrWGzmmZW2+YGAQ\\/TrmtpxD\\r\\ne2M8DgqlxC0bZ6gMMU+WxPNcKKKK57wXqC614H012h8u4sI1tJPdVXg5+g\\/PNaqhcjGc9yaq+GNI\\r\\nbQ\\/DckDZd5mLyYHCYyoGfWpyDIwX7oraGxhUCiiikdMq\\/ow6ZxRs2ovpigRIAD1J5JJpzoWyEGBj\\r\\ntVmQUUUVh+MdFfxJ4Gv7KP57pGFxAFHdeoH1GR+NeNWkq30T+Yo25weO\\/evoCBnhaN+gByAB1Hev\\r\\nGPFei\\/8ACO+K9RtEXba3LfarcjH3X6gfQjH4VMkaU5WYUUUVx1\\/ZPpepIwx5Uo3xkeneteMh0B71\\r\\nUvWe4gtHb5\\/s5KYI\\/vH\\/AOtVqNNi4HTtWT1RvswoooqZCd\\/FbNhA7YcCsVSVPSoXmvQd\\/wBodAv3\\r\\nQjEYqVG5TYUUUV6BAxCDPUVpWt7swprzOLUNfZALed2UeoVj+tWFutdwHnvdqj+Hao\\/pT5RJsKKK\\r\\nK9QXUBkdKH1IAHLAKO5PSvOLTWS8hQ3O5x6NXTRW09zZLNMwSI872OBj1pWKCiiikvfHDWpK2VjL\\r\\ndvngltq\\/X3\\/SsG5n8beJ3UM0dvBnhUfaq\\/XqTTJb62R2a3YPGCfnwRVi08d6dpOP9Fmu5+yKMJn3\\r\\n\\/wD1VUSWFFFFbOkaNcaNAs2oXaSMvXaCR\\/n8K9B8OPc6owlMM0dqBnzpYyikeoz2rk9G13xnqdxH\\r\\nKZbXRrL+G3htFLn3ORx\\/nit6\\/fWorQXVvq091eeakYtbggwziQ7CrLwMc02TqFFFFbmjalHqHhrU\\r\\n5fMV4ft0kUDpxvUbSpqru2AfODipE03+ytMstOMkbmJTvMSbVLE5OBT0hQA8Ek1pEwmFFFFQoPnG\\r\\nR1HrUnmbpTgdse1SG2Jx83A7etMaCUHpnHpVEBRRRVTc0qqThT\\/drJ8W+Gv+Er0rZDIE1S0Ba0fO\\r\\nN3qh9jj\\/ADzWxwPmxnB4qTdtaOQDa6ndQAUUUV4AiSCN4p49kyPiRCMEMDzUh+VcY6kV6F4p+HF1\\r\\nqesyahoF7bxtdNvmtrpiNrnqVIByO+K4rVNKv9C1N9N1MRi6jAJMZJVgehBPaspRN4zuFFFFVGAR\\r\\nNznaBwc0z+0dOtm\\/fJcznHSHC4\\/E1Y2tJDKm7IYg4I9KZHbLIRnFSrGmoUUUVJb+K7CF8fZWt4j1\\r\\nY\\/Of0qeDXry5l87SrRZI8E7rmJSv1GTinQ6fApBMUbH1Kg1dSLanHbsOlFwsFFFFZGq61rF7Yf2d\\r\\nNcQuHkXDLbqjLg9sV6JLealB4SuZbP7PdzmExIJoxtVTx06E+mf\\/ANfnojJkjLqDsOR9a9R8AMks\\r\\n\\/wBguQs1reQMu3qAcZI\\/IGi9yuWyCiiiuVsNNOpeHrRdQtlWYR7SjpjoSBkfTFMttHgs7lZfs0Ss\\r\\nvQqoGK7i40CTS5nQSGe0JzE7ffUf3T\\/jVb7JE2eMn35pBYKKKKrWt7tHyjmtCET3d3Zs+1IYZ0nJ\\r\\n7ttOQBTYoFTBCjj0FWPN8tc+lIGFFFFa01ybmVmBxjvRHI3U7mB7Vn2GZIDK2csxNW0CmRgxPHTF\\r\\nbx2OWW4UUUVKsrM2eRn9KepBcfvCP5VBvIbbEuVUfeHXPpUhOFBZT6VRAUUUVBnLjGAPelyCp5\\/G\\r\\nmY6D0pwY8cUAFFFFC8nnsOTXIfE\\/TPtml2viCIHfZEQXH\\/XNvun8D\\/P2rrsnaRnkmntaR6pp95pl\\r\\nxxDdxGMnHQ9j+BoYJ2CiiivDoW6ehq9DtZlyi8egrMiils5pbO4UrPbu0br6EHFXYX5Brmloztg7\\r\\noKKKK2Ywj4yq4+lPaEFBgDmqVtOe9aDSgIDU3KsFFFFc2Ekubi5EWNkDYYn\\/AD7Gu\\/8ACEy2Qtbq\\r\\nMltrdP0P6Zrz1bh9Pmv28gyiViUGeOp6\\/nVnQNY1G3uSIoi4YcooJAPrTTKCiiivoOb7Ndqr7kMb\\r\\ndd3Fcw1kjX139kkWWGOTClW3ZyAevt0rjh4evfFFui32sXMNrv3PFGxOPwJwK9B0mwstJ02GxsUK\\r\\nQRj+I5LHuSfWmTcKKKKorbnbjoarXEXIjreZEHNZUkkMVy09w6JBCpeRnPAUcnNBLYUUUVSt\\/Eel\\r\\nW3i2XwjMzRahGilHfGx2IDbB74I+vP47jRvBzIuDXzL4j1WXX\\/FF9riyODNPuiYcMirgJ9CABXpW\\r\\nn+P9bOkrrMSHVbe0QJqenyHa8RxxKjjJ2nqeDjn6jsjC8dDim7MKKKK9PJPydATzkU3CHAzzjOKi\\r\\n8Oa7o3jLT\\/t+iTg+XgTW0nEsJPZh\\/UcHHWrZQhs4AI9qm1gCiiiqmOM+lAO2MHHNSEbsHsBSMnHN\\r\\nIAooopBjIJGRTlkKsuOvam4qzCkUCNe3cqW9pAvmSSyHCgDrzQAUUUV5h8U9Ng0zxHpuoxNtfVUb\\r\\nzYv9pAPm\\/HI\\/ya5eM4rF8Z+J5fFXjC51iPckCMI7RW\\/hjXp+Zyx9yak0zVluv3UnyzAZx2b6VnUj\\r\\nobUpBRRRW7G+DVg3XygMelZyvyKlzuBI7CuY6bhRRRUhKyjjrW14bGiWVy02q6mtsQPlRgcH8e\\/0\\r\\nrl3ivCp8mbyw3XH+PalttPgLf8TG5uAgHVef5g1SKSCiiivSv+Ex8M+HoZ2tVm1aS4YMdh2qoHoe\\r\\nvemv8SLHUbd4tO0PV0uNucNGAi++7PT8K5jStW0fSt0Ol2c13O4wZShH6kfyFdDbC\\/uBuul25HCZ\\r\\nzTuJxQUUUVf0bWr6W3f7Wo65GO1aPh\\/RLfxZcXk2r23naQFMKRtIVEr8ZPykcAe\\/f8spLea4mSzt\\r\\nziWbjP8AdHc\\/gK9E09IrK1t7S3ULBCAijHX1J9z1ouZMKKKK+ePiZ8MrnwRdi+01pJ9EuGwjHloW\\r\\n\\/uMf5HvXPeDvEc+ha0txk+UwCXCf30\\/xHWvrTVNLtde0W70m8UGC5jKH\\/Z9CPcHB\\/CvjW\\/s5NLvr\\r\\nm3kGJYJXhYfQkH+VddCZzzjdWCiiiuu1rSL3wp48tL7w1drbi8H2iydDhDnkx+hB4wOmGAr2Pwn4\\r\\nytfFFu0GoQjTdat1\\/wBJt5PlU\\/7a57d\\/b3615pLaHxR8HrS4iGb7SwWXHXahII\\/75GfqBVzQrqy8\\r\\nS6RBdz2sFzcqvl3iOuNxHuORkcjHSu504zRxSqSgFFFFeoAHGe1G7oKdFE8pAUE1i+JfGOgeD4z9\\r\\nrmW81L+CxhYFs9t390dOv5GuA6gooorV1PUdM8OaM2r63P5NqDtRQMvK3ZVHc\\/8A1zwBmvAPGnjz\\r\\nUfG19tbda6TE37iyRuP95\\/7zfy7d80vF\\/i\\/V\\/Guppd6mypFCCsFtHwkQPXHqTgZP\\/wCqsRelUl3D\\r\\noFFFFOPTA7UsMvkTpJ6HB+lM60GiSuhwdmFFFFdZDJkDBJHFXYpQaw9KnL23zckHFayr8\\/FcclZn\\r\\nYtgoooq8lX7e3imlBkOQP4ayY3YHBq9AZSRt4GOtQVcKKKK7TShb2qhYVRFI5XHFaUuowEiGH95K\\r\\neyiuTtLGacrukO3GTiup020itYf3aYYj5nPU1RLYUUUVqaRAIC0x\\/wBdIACfQeldFbtnFYNswQD1\\r\\nrZsnzt9zTSJYUUUV0ELcg+tfM3xZ0xbDx7rEaqSk4W6UjtuALf8Aj2a+k4TyorxP4wQf8Vg0gHMl\\r\\nmkZ\\/WtqejMpBRRRXIfC\\/VJ4vEVvpglxazRyiSP8AvHGQareDbgaL43v9H3nynkkgXPdkY4z+ANUf\\r\\nBT\\/Y\\/iBpRfgGUofqVIpvihv7K+JN7NG+0RXgk3Y9cMf5mvTpvRHFUim2goooruPFXxXvTBJpvh61\\r\\nazjmj\\/4\\/ZP8AWFT3QdB355\\/CvLdoUl2JeRuWdjkk1Zvbs3V3LOW3bmwp\\/wBkcD9KpMxNcdkjcKKK\\r\\nKjPLUuMdaUDvS00iWFFFFJ+FGKXFOC807BcKKKKu6S+2Yx9ic10yDv7Vy1oNlyp9q6y3QtEpx1Fc\\r\\ntWNmddOV0FFFFPWInpWnZKOPpVWFfmwa04LdgQQeorA1Ciiit60G1ePStm3yUFZFoBgZrYhcYAFU\\r\\nSFFFFX4V6VqWWQ6+xqCzt965xzmtK3tHSVcrwfWqSJCiiitiBSdrCvHvisjHV7iY\\/wAEsUY47GIm\\r\\nvabZcRLkcjivKPjCEhgQn71xdKw+ix4P9K2gtTGUgooorxGMfZvFGkyjIDXUX\\/oQzV\\/4h2uPEupX\\r\\nGP8Aluq\\/nGDWdq0n2SbSLzbkJKZB77SprqPH0Ami1K8QEf6VExyf4THj+eK9ClsclV2aYUUUVwZP\\r\\nApnp71K1NiuPstxHMI1k2Nna\\/Q1ydTdBRRRUvllVwQc55qMCtiK607VXI8xbCY\\/wzNlCf97H86hu\\r\\ntLubRv3sRwejjlTW0bNGbCiiiqAC496nii3DNMaDKZU4NS2Umx\\/Kfhs5FVYlvQKKKKkSL5SwHSu5\\r\\n0OKO70u3nTlHHBPscH9RXJxIq+b6EZFdL8PrpDdXWhT5DY8+1J9P4lH8\\/wA6xrwurmtCprYKKKK1\\r\\nJNKkDbo8kVu6RpL3kOB8rrx81XUtccV0ehxxBCnG4H864rHaFFFFYY0S8hb5ouPUGp47WWNhlcHN\\r\\ndmIhtxWfc24ViQBTsFwooorQ07ySRjB7Vs4T2ri7eaS2m9jW1Fe7gOaaJkgoooraWVVySQFAySTw\\r\\nK8O+LmqC61HTbcHBWKSYg+jEAf8AoJr0++vNyeSD977x9vSvAfGOqLqfiy\\/mByA3kIM5wqccfU8\\/\\r\\njXRTRzyCiiiuV8RqfsmnoTwqMf5V2uvO2oeAbnUnXBuI7ZzjpkbRxXJ35jvNY0+0fmNY9rfjn\\/Ct\\r\\n+TUxoWhN4W8Q2c0tlKpa0vLdvvKTkdf7p\\/oMYwT201pc5aqvYKKKK4mSqzVddMjP4VUdcGuNm4UU\\r\\nUVCRmr1jrF5YAICJ7foYZeVx7elVdtNYYWhMYUUUV0cE1nqKgRYgnJ\\/1LnOf9096bPp53lJAyOOh\\r\\nxgg1kS22G29QMfyrU07Xvs8gttVVp7YnHndZIvfPce3\\/AOqumL7mLjfYKKKKsRWsssawlgrsOtaQ\\r\\neXSr2z1e3XdLZSAuq\\/xIeGHT0J\\/WpjbfZJdwZZIJVDRTLyGHqDVqKFWXawyGAyD0Oa0aUo2MVJxk\\r\\nFFFFenxyRS7JomDRSKHQjuDyKvQfIdynvXJeB3Nzob2GWM2mv5LbjyUPzIfyOPwrrYYmArzJxs7H\\r\\nqQldBRRRWxFeEqPWkmk31DFHwKmMWOtQkXdBRRRVOUU1Z8Lu3YUdTSz3VsuUzvPoOn51k3N3JKwU\\r\\nkKo\\/gUVrGmYzqdgoooqHxFrX2DQru5iP7wJtTJ5yTjP65rxf7Lb+em+SQlvmlbPeu28d3LLYW0CO\\r\\ndzy7ivqoHOfxIribbdI53k5zXRHQxCiiis9vJi8SRyrE4gV1fa55YD\\/Gu3119P8AMGkapM6adOok\\r\\nt52+Ywv6ZxxjofY1x6SC78USb+YkZIsEYxjg\\/rmuj8S4NrF5kJkUsQcDpxXXT+E5Kz1Ciiiv\\/9k=\",\"top\":3,\"startTime\":\"20180602\",\"endTime\":\"20180602\"}";
        SearchBean searchBean = gson.fromJson(json, SearchBean.class);
        System.out.println();
    }
}
