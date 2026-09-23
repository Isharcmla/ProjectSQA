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

public class Element_html_1137954597102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55177;
     Object term55224;

    public Element_html_1137954597102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55203 = new ArrayList();
        ((ArrayList) term55203).add((Object)null);
        ((ArrayList) term55203).add((Object)null);
        term55177 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55178 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55199 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term55200 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term55201 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term55207 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55209 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55210 = (Object[]) newArray("java.lang.String", 0);
        setField(term55178, term55178.getClass(), "tagName", "SIODFGaQhr");
        setBooleanField(term55178, term55178.getClass(), "isBlock", true);
        setBooleanField(term55178, term55178.getClass(), "formatAsBlock", false);
        setBooleanField(term55178, term55178.getClass(), "canContainInline", true);
        setBooleanField(term55178, term55178.getClass(), "empty", true);
        setBooleanField(term55178, term55178.getClass(), "selfClosing", true);
        setBooleanField(term55178, term55178.getClass(), "preserveWhitespace", true);
        setBooleanField(term55178, term55178.getClass(), "formList", false);
        setBooleanField(term55178, term55178.getClass(), "formSubmit", false);
        setField(term55177, term55177.getClass(), "tag", term55178);
        setField(term55199, term55199.getClass(), "referent", null);
        setField(term55200, term55200.getClass(), "lock", term55201);
        setField(term55200, term55200.getClass(), "head", null);
        setLongField(term55200, term55200.getClass(), "queueLength", 7247160664318067468L);
        setField(term55199, term55199.getClass(), "queue", term55200);
        setField(term55199, term55199.getClass(), "next", null);
        setField(term55199, term55199.getClass(), "discovered", null);
        setField(term55177, term55177.getClass(), "shadowChildrenRef", term55199);
        setField(term55177, term55177.getClass(), "childNodes", term55203);
        setIntField(term55207, term55207.getClass(), "size", 1743683601);
        setField(term55207, term55207.getClass(), "keys", term55209);
        setField(term55207, term55207.getClass(), "vals", term55210);
        setField(term55177, term55177.getClass(), "attributes", term55207);
        setField(term55177, term55177.getClass(), "baseUri", "qYzsiuXOgS");
        setField(term55177, term55177.getClass(), "parentNode", null);
        setIntField(term55177, term55177.getClass(), "siblingIndex", -945116798);
        term55224 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term55225 = (byte[]) newByteArray(16);
        setField(term55224, term55224.getClass(), "value", term55225);
        setByteField(term55224, term55224.getClass(), "coder", (byte) 75);
        setIntField(term55224, term55224.getClass(), "count", 1593461795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term55224;
        callMethod(klass, "html", argTypes, term55177, args);
    }

};


