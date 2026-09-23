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

public class Element_html_1332780889103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8923;

    public Element_html_1332780889103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8949 = new ArrayList();
        ((ArrayList) term8949).add((Object)null);
        ((ArrayList) term8949).add((Object)null);
        term8923 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8924 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8945 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term8946 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term8947 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term8953 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8955 = (Object[]) newArray("java.lang.String", 0);
        Object[] term8956 = (Object[]) newArray("java.lang.String", 0);
        setField(term8924, term8924.getClass(), "tagName", "bxrCBbrrct");
        setBooleanField(term8924, term8924.getClass(), "isBlock", false);
        setBooleanField(term8924, term8924.getClass(), "formatAsBlock", true);
        setBooleanField(term8924, term8924.getClass(), "canContainInline", false);
        setBooleanField(term8924, term8924.getClass(), "empty", false);
        setBooleanField(term8924, term8924.getClass(), "selfClosing", true);
        setBooleanField(term8924, term8924.getClass(), "preserveWhitespace", true);
        setBooleanField(term8924, term8924.getClass(), "formList", false);
        setBooleanField(term8924, term8924.getClass(), "formSubmit", true);
        setField(term8923, term8923.getClass(), "tag", term8924);
        setField(term8945, term8945.getClass(), "referent", null);
        setField(term8946, term8946.getClass(), "lock", term8947);
        setField(term8946, term8946.getClass(), "head", null);
        setLongField(term8946, term8946.getClass(), "queueLength", 2135754395358000892L);
        setField(term8945, term8945.getClass(), "queue", term8946);
        setField(term8945, term8945.getClass(), "next", null);
        setField(term8945, term8945.getClass(), "discovered", null);
        setField(term8923, term8923.getClass(), "shadowChildrenRef", term8945);
        setField(term8923, term8923.getClass(), "childNodes", term8949);
        setIntField(term8953, term8953.getClass(), "size", -129547140);
        setField(term8953, term8953.getClass(), "keys", term8955);
        setField(term8953, term8953.getClass(), "vals", term8956);
        setField(term8923, term8923.getClass(), "attributes", term8953);
        setField(term8923, term8923.getClass(), "baseUri", "CKWpJaaaxX");
        setField(term8923, term8923.getClass(), "parentNode", null);
        setIntField(term8923, term8923.getClass(), "siblingIndex", 199287428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "html", argTypes, term8923, args);
    }

};


