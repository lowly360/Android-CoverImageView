CoverImageView
===============
[![](https://img.shields.io/badge/CoverImageView-v1.0.0-brightgreen.svg)](https://github.com/lowly360/CoverImageView)
[![API](https://img.shields.io/badge/API-3%2B-green.svg?style=flat)](https://android-arsenal.com/api?level=3)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)


**CoverImageView** that can customize or dynamically change the image overlay color

![sreenshort](https://raw.githubusercontent.com/lowly360/CoverImageView/master/screenshot.gif )

Gradle
------
```
dependencies {
    ...
    implementation 'cn.itlowly.view:CoverImageview:1.0.0'
}
```

Usage
-----
```xml
<cn.itlowly.coverimageview.view.CoverImageView
            android:layout_width="80dp"
            android:layout_height="80dp"
            android:padding="10dp"
            android:src="@drawable/tag_ep_a"
            app:cover_color="#ff00ff" />
```

```
CoverImageView coverImageView = findViewById(R.id.cimg_test);
    coverImageView.setCoverColor(Color.RED);
```

FAQ
---

Changelog
---------
* **1.0.0**
    * Initial release

License
-------

    Copyright 2014 - 2018 itlowly

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.