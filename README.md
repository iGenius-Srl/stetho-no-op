# Stetho no-op library
Having two different Application subclasses just for [stetho](http://facebook.github.io/stetho/) (debug and release) is annoying, so to keep everything plain and simple, to use stetho just add this for debug and production release:

```groovy
repositories {
    maven { url 'http://dl.bintray.com/igenius-code/maven' }
}
```

```groovy
def stethoVersion = "1.4.2"

debugCompile "com.facebook.stetho:stetho:${stethoVersion}"
debugCompile "com.facebook.stetho:stetho-okhttp3:${stethoVersion}"
releaseCompile "net.igenius:stetho-no-op:1.1"
```

## License <a name="license"></a>

    Copyright (C) 2017 iGenius Srl

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

