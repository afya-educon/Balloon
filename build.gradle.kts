// Designed and developed by 2019 skydoves (Jaewoong Eum)
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
//    You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
//     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

group = "com.github.afya-educon"
version = "1.5.2-v6"

plugins {
  alias(libs.plugins.android.application) apply false
  alias(libs.plugins.android.library) apply false
  alias(libs.plugins.kotlin.android) apply false
  alias(libs.plugins.nexus.plugin)
  alias(libs.plugins.dokka)
  alias(libs.plugins.kotlin.binary.compatibility)
}

apiValidation {
  ignoredPackages.add("com/skydoves/balloon/databinding")
  nonPublicMarkers.add("kotlin.PublishedApi")
}

subprojects {
  apply(plugin = "maven-publish")
}
