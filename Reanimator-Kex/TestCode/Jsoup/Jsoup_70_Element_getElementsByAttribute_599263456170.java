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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Element_getElementsByAttribute_599263456170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4274;

    public Element_getElementsByAttribute_599263456170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4300 = new ArrayList();
        ((ArrayList) term4300).add((Object)null);
        ((ArrayList) term4300).add((Object)null);
        ((ArrayList) term4300).add((Object)null);
        ((ArrayList) term4300).add((Object)null);
        term4274 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4275 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4296 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4297 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4298 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4304 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4306 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4307 = (Object[]) newArray("java.lang.String", 0);
        setField(term4275, term4275.getClass(), "tagName", "ZzIujlwVsw");
        setBooleanField(term4275, term4275.getClass(), "isBlock", false);
        setBooleanField(term4275, term4275.getClass(), "formatAsBlock", true);
        setBooleanField(term4275, term4275.getClass(), "canContainInline", false);
        setBooleanField(term4275, term4275.getClass(), "empty", false);
        setBooleanField(term4275, term4275.getClass(), "selfClosing", false);
        setBooleanField(term4275, term4275.getClass(), "preserveWhitespace", true);
        setBooleanField(term4275, term4275.getClass(), "formList", false);
        setBooleanField(term4275, term4275.getClass(), "formSubmit", true);
        setField(term4274, term4274.getClass(), "tag", term4275);
        setField(term4296, term4296.getClass(), "referent", null);
        setField(term4297, term4297.getClass(), "lock", term4298);
        setField(term4297, term4297.getClass(), "head", null);
        setLongField(term4297, term4297.getClass(), "queueLength", 3825396310311739952L);
        setField(term4296, term4296.getClass(), "queue", term4297);
        setField(term4296, term4296.getClass(), "next", null);
        setField(term4296, term4296.getClass(), "discovered", null);
        setField(term4274, term4274.getClass(), "shadowChildrenRef", term4296);
        setField(term4274, term4274.getClass(), "childNodes", term4300);
        setIntField(term4304, term4304.getClass(), "size", 906181092);
        setField(term4304, term4304.getClass(), "keys", term4306);
        setField(term4304, term4304.getClass(), "vals", term4307);
        setField(term4274, term4274.getClass(), "attributes", term4304);
        setField(term4274, term4274.getClass(), "baseUri", "LWyEaeIyAo");
        setField(term4274, term4274.getClass(), "parentNode", null);
        setIntField(term4274, term4274.getClass(), "siblingIndex", 1045657203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yVMkkQhvmN";
        try {
            callMethod(klass, "getElementsByAttribute", argTypes, term4274, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


