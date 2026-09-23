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

public class Element_getElementsByAttributeValueMatching_1502127233145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4431;
     Object term27522;
     Object term27506;

    public Element_getElementsByAttributeValueMatching_1502127233145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4454 = new ArrayList();
        ((ArrayList) term4454).add((Object)null);
        LinkedHashMap term4459 = new LinkedHashMap();
        term4431 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4432 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4458 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4432, term4432.getClass(), "tagName", "DIbeDHICho");
        setBooleanField(term4432, term4432.getClass(), "isBlock", true);
        setBooleanField(term4432, term4432.getClass(), "formatAsBlock", true);
        setBooleanField(term4432, term4432.getClass(), "canContainBlock", false);
        setBooleanField(term4432, term4432.getClass(), "canContainInline", true);
        setBooleanField(term4432, term4432.getClass(), "empty", false);
        setBooleanField(term4432, term4432.getClass(), "selfClosing", true);
        setBooleanField(term4432, term4432.getClass(), "preserveWhitespace", false);
        setBooleanField(term4432, term4432.getClass(), "formList", false);
        setBooleanField(term4432, term4432.getClass(), "formSubmit", false);
        setField(term4431, term4431.getClass(), "tag", term4432);
        setField(term4431, term4431.getClass(), "parentNode", null);
        setField(term4431, term4431.getClass(), "childNodes", term4454);
        setField(term4458, term4458.getClass(), "attributes", term4459);
        setField(term4431, term4431.getClass(), "attributes", term4458);
        setField(term4431, term4431.getClass(), "baseUri", "yUGCjlqgJE");
        setIntField(term4431, term4431.getClass(), "siblingIndex", -344842608);
        ArrayList term27526 = new ArrayList();
        ((ArrayList) term27526).add((Object)null);
        LinkedHashMap term27529 = new LinkedHashMap();
        term27522 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term27523 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term27528 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term27523, term27523.getClass(), "tagName", "DIbeDHICho");
        setBooleanField(term27523, term27523.getClass(), "isBlock", true);
        setBooleanField(term27523, term27523.getClass(), "formatAsBlock", true);
        setBooleanField(term27523, term27523.getClass(), "canContainBlock", false);
        setBooleanField(term27523, term27523.getClass(), "canContainInline", true);
        setBooleanField(term27523, term27523.getClass(), "empty", false);
        setBooleanField(term27523, term27523.getClass(), "selfClosing", true);
        setBooleanField(term27523, term27523.getClass(), "preserveWhitespace", false);
        setBooleanField(term27523, term27523.getClass(), "formList", false);
        setBooleanField(term27523, term27523.getClass(), "formSubmit", false);
        setField(term27522, term27522.getClass(), "tag", term27523);
        setField(term27522, term27522.getClass(), "parentNode", null);
        setField(term27522, term27522.getClass(), "childNodes", term27526);
        setField(term27528, term27528.getClass(), "attributes", term27529);
        setField(term27522, term27522.getClass(), "attributes", term27528);
        setField(term27522, term27522.getClass(), "baseUri", "yUGCjlqgJE");
        setIntField(term27522, term27522.getClass(), "siblingIndex", -344842608);
        term27506 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term27507 = (Object[]) newArray("java.lang.Object", 0);
        setField(term27506, term27506.getClass(), "elementData", term27507);
        setIntField(term27506, term27506.getClass(), "size", 0);
        setIntField(term27506, term27506.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "PXdVZyoJyC";
        args[1] = "vLerpqavFM";
        Object retValue = callMethod(klass, "getElementsByAttributeValueMatching", argTypes, term4431, args);
        assertTrue(recursiveEquals(term4431, term27522));
        assertTrue(recursiveEquals(retValue, term27506));
    }

};


