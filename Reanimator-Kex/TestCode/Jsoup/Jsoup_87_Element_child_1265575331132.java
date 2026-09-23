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
import java.lang.IndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class Element_child_1265575331132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1386;
     Object term1433;

    public Element_child_1265575331132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1412 = new ArrayList();
        ((ArrayList) term1412).add((Object)null);
        ((ArrayList) term1412).add((Object)null);
        ((ArrayList) term1412).add((Object)null);
        ((ArrayList) term1412).add((Object)null);
        ((ArrayList) term1412).add((Object)null);
        ((ArrayList) term1412).add((Object)null);
        ((ArrayList) term1412).add((Object)null);
        ((ArrayList) term1412).add((Object)null);
        term1386 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1387 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1408 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1409 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1410 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1416 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1418 = (Object[]) newArray("java.lang.String", 0);
        Object[] term1419 = (Object[]) newArray("java.lang.String", 0);
        setField(term1387, term1387.getClass(), "tagName", "tShwQLRGNe");
        setBooleanField(term1387, term1387.getClass(), "isBlock", true);
        setBooleanField(term1387, term1387.getClass(), "formatAsBlock", false);
        setBooleanField(term1387, term1387.getClass(), "canContainInline", false);
        setBooleanField(term1387, term1387.getClass(), "empty", true);
        setBooleanField(term1387, term1387.getClass(), "selfClosing", false);
        setBooleanField(term1387, term1387.getClass(), "preserveWhitespace", true);
        setBooleanField(term1387, term1387.getClass(), "formList", false);
        setBooleanField(term1387, term1387.getClass(), "formSubmit", true);
        setField(term1386, term1386.getClass(), "tag", term1387);
        setField(term1408, term1408.getClass(), "referent", null);
        setField(term1409, term1409.getClass(), "lock", term1410);
        setField(term1409, term1409.getClass(), "head", null);
        setLongField(term1409, term1409.getClass(), "queueLength", -6573104506744284592L);
        setField(term1408, term1408.getClass(), "queue", term1409);
        setField(term1408, term1408.getClass(), "next", null);
        setField(term1408, term1408.getClass(), "discovered", null);
        setField(term1386, term1386.getClass(), "shadowChildrenRef", term1408);
        setField(term1386, term1386.getClass(), "childNodes", term1412);
        setIntField(term1416, term1416.getClass(), "size", -469968304);
        setField(term1416, term1416.getClass(), "keys", term1418);
        setField(term1416, term1416.getClass(), "vals", term1419);
        setField(term1386, term1386.getClass(), "attributes", term1416);
        setField(term1386, term1386.getClass(), "baseUri", "LvtrsXUliU");
        setField(term1386, term1386.getClass(), "parentNode", null);
        setIntField(term1386, term1386.getClass(), "siblingIndex", -1145578966);
        term1433 = new Integer(679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1433;
        try {
            callMethod(klass, "child", argTypes, term1386, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


