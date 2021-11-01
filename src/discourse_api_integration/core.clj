(ns discourse-api-integration.core
    (:require [clj-http.client :as client]))

(def discourse-url
  {:latest "https://uneptest.discoursehosting.net/latest.json"

   :categories "https://uneptest.discoursehosting.net/categories_and_latest"

   :badges "https://uneptest.discoursehosting.net/badges.json"})

(defn login [url]
      (let [result (client/get url)]
           (when (= (:status result) 200)
                 (println result))))

(defn -main [& args]
      (login (:latest discourse-url)))


