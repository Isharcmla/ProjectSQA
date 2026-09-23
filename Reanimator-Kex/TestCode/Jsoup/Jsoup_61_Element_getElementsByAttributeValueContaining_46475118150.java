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
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsByAttributeValueContaining_46475118150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4262;
     Object term27361;
     Object term27357;

    public Element_getElementsByAttributeValueContaining_46475118150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4284 = new ArrayList();
        ((ArrayList) term4284).add((Object)null);
        ((ArrayList) term4284).add((Object)null);
        ((ArrayList) term4284).add((Object)null);
        ((ArrayList) term4284).add((Object)null);
        ((ArrayList) term4284).add((Object)null);
        ((ArrayList) term4284).add((Object)null);
        ((ArrayList) term4284).add((Object)null);
        LinkedHashMap term4289 = new LinkedHashMap();
        term4262 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4263 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4288 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4263, term4263.getClass(), "tagName", "urCiQnUFBM");
        setBooleanField(term4263, term4263.getClass(), "isBlock", false);
        setBooleanField(term4263, term4263.getClass(), "formatAsBlock", false);
        setBooleanField(term4263, term4263.getClass(), "canContainInline", false);
        setBooleanField(term4263, term4263.getClass(), "empty", false);
        setBooleanField(term4263, term4263.getClass(), "selfClosing", false);
        setBooleanField(term4263, term4263.getClass(), "preserveWhitespace", false);
        setBooleanField(term4263, term4263.getClass(), "formList", true);
        setBooleanField(term4263, term4263.getClass(), "formSubmit", false);
        setField(term4262, term4262.getClass(), "tag", term4263);
        setField(term4262, term4262.getClass(), "parentNode", null);
        setField(term4262, term4262.getClass(), "childNodes", term4284);
        setField(term4288, term4288.getClass(), "attributes", term4289);
        setField(term4262, term4262.getClass(), "attributes", term4288);
        setField(term4262, term4262.getClass(), "baseUri", "dJGPlmSRnz");
        setIntField(term4262, term4262.getClass(), "siblingIndex", 2055867847);
        ArrayList term27365 = new ArrayList();
        ((ArrayList) term27365).add((Object)null);
        ((ArrayList) term27365).add((Object)null);
        ((ArrayList) term27365).add((Object)null);
        ((ArrayList) term27365).add((Object)null);
        ((ArrayList) term27365).add((Object)null);
        ((ArrayList) term27365).add((Object)null);
        ((ArrayList) term27365).add((Object)null);
        LinkedHashMap term27368 = new LinkedHashMap();
        term27361 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term27362 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term27367 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term27362, term27362.getClass(), "tagName", "urCiQnUFBM");
        setBooleanField(term27362, term27362.getClass(), "isBlock", false);
        setBooleanField(term27362, term27362.getClass(), "formatAsBlock", false);
        setBooleanField(term27362, term27362.getClass(), "canContainInline", false);
        setBooleanField(term27362, term27362.getClass(), "empty", false);
        setBooleanField(term27362, term27362.getClass(), "selfClosing", false);
        setBooleanField(term27362, term27362.getClass(), "preserveWhitespace", false);
        setBooleanField(term27362, term27362.getClass(), "formList", true);
        setBooleanField(term27362, term27362.getClass(), "formSubmit", false);
        setField(term27361, term27361.getClass(), "tag", term27362);
        setField(term27361, term27361.getClass(), "parentNode", null);
        setField(term27361, term27361.getClass(), "childNodes", term27365);
        setField(term27367, term27367.getClass(), "attributes", term27368);
        setField(term27361, term27361.getClass(), "attributes", term27367);
        setField(term27361, term27361.getClass(), "baseUri", "dJGPlmSRnz");
        setIntField(term27361, term27361.getClass(), "siblingIndex", 2055867847);
        term27357 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term27358 = (Object[]) newArray("java.lang.Object", 0);
        setField(term27357, term27357.getClass(), "elementData", term27358);
        setIntField(term27357, term27357.getClass(), "size", 0);
        setIntField(term27357, term27357.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "DPskuFUobI";
        args[1] = "wBGfLpNNiZ";
        Object retValue = callMethod(klass, "getElementsByAttributeValueContaining", argTypes, term4262, args);
        assertTrue(recursiveEquals(term4262, term27361));
        assertTrue(recursiveEquals(retValue, term27357));
    }

};


