(ns tryclojure.views.home
  (:require [hiccup.element :refer [javascript-tag link-to unordered-list]]
            [hiccup.page :refer [include-css include-js html5]]
            [hiccup.core :refer [html]]))

(defn root-html []
  (html5
   [:head
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
    (include-css "/css/tryclojure.css")
    (include-js "http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"
                "/javascript/jquery-console/jquery.console.js"
                "/javascript/tryclojure.js")
    [:title "Browser REPL"]]
   [:body
    [:div#wrapper
     [:div#content
      [:div#header
       [:h1
        [:span.logo-try "Welcome To Clojure"]]]
      [:div#container
       [:div#console.console]]]]]))

