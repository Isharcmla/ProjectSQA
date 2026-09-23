package org.jsoup.nodes;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class FormElement_submit_9147046913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;

    public FormElement_submit_9147046913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term297 = new ArrayList();
        ((ArrayList) term297).add((Object)null);
        ((ArrayList) term297).add((Object)null);
        term267 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term268 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term269 = (Object[]) newArray("java.lang.Object", 0);
        Object term272 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term293 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term294 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term295 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term301 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term303 = (Object[]) newArray("java.lang.String", 0);
        Object[] term304 = (Object[]) newArray("java.lang.String", 0);
        setField(term268, term268.getClass(), "elementData", term269);
        setIntField(term268, term268.getClass(), "size", 0);
        setIntField(term268, term268.getClass(), "modCount", 0);
        setField(term267, term267.getClass(), "elements", term268);
        setField(term272, term272.getClass(), "tagName", "hRNSzYYIrc");
        setBooleanField(term272, term272.getClass(), "isBlock", true);
        setBooleanField(term272, term272.getClass(), "formatAsBlock", false);
        setBooleanField(term272, term272.getClass(), "canContainInline", true);
        setBooleanField(term272, term272.getClass(), "empty", true);
        setBooleanField(term272, term272.getClass(), "selfClosing", true);
        setBooleanField(term272, term272.getClass(), "preserveWhitespace", true);
        setBooleanField(term272, term272.getClass(), "formList", false);
        setBooleanField(term272, term272.getClass(), "formSubmit", false);
        setField(term267, term267.getClass(), "tag", term272);
        setField(term293, term293.getClass(), "referent", null);
        setField(term294, term294.getClass(), "lock", term295);
        setField(term294, term294.getClass(), "head", null);
        setLongField(term294, term294.getClass(), "queueLength", -8400487765614892086L);
        setField(term293, term293.getClass(), "queue", term294);
        setField(term293, term293.getClass(), "next", null);
        setField(term293, term293.getClass(), "discovered", null);
        setField(term267, term267.getClass(), "shadowChildrenRef", term293);
        setField(term267, term267.getClass(), "childNodes", term297);
        setIntField(term301, term301.getClass(), "size", -2038273078);
        setField(term301, term301.getClass(), "keys", term303);
        setField(term301, term301.getClass(), "vals", term304);
        setField(term267, term267.getClass(), "attributes", term301);
        setField(term267, term267.getClass(), "baseUri", "RMFIsYGgne");
        setField(term267, term267.getClass(), "parentNode", null);
        setIntField(term267, term267.getClass(), "siblingIndex", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "submit", argTypes, term267, args);
    }

};


