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
     Object term27697;
     Object term27681;

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
        ArrayList term27701 = new ArrayList();
        ((ArrayList) term27701).add((Object)null);
        LinkedHashMap term27704 = new LinkedHashMap();
        term27697 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term27698 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term27703 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term27698, term27698.getClass(), "tagName", "DIbeDHICho");
        setBooleanField(term27698, term27698.getClass(), "isBlock", true);
        setBooleanField(term27698, term27698.getClass(), "formatAsBlock", true);
        setBooleanField(term27698, term27698.getClass(), "canContainBlock", false);
        setBooleanField(term27698, term27698.getClass(), "canContainInline", true);
        setBooleanField(term27698, term27698.getClass(), "empty", false);
        setBooleanField(term27698, term27698.getClass(), "selfClosing", true);
        setBooleanField(term27698, term27698.getClass(), "preserveWhitespace", false);
        setBooleanField(term27698, term27698.getClass(), "formList", false);
        setBooleanField(term27698, term27698.getClass(), "formSubmit", false);
        setField(term27697, term27697.getClass(), "tag", term27698);
        setField(term27697, term27697.getClass(), "parentNode", null);
        setField(term27697, term27697.getClass(), "childNodes", term27701);
        setField(term27703, term27703.getClass(), "attributes", term27704);
        setField(term27697, term27697.getClass(), "attributes", term27703);
        setField(term27697, term27697.getClass(), "baseUri", "yUGCjlqgJE");
        setIntField(term27697, term27697.getClass(), "siblingIndex", -344842608);
        term27681 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term27682 = (Object[]) newArray("java.lang.Object", 0);
        setField(term27681, term27681.getClass(), "elementData", term27682);
        setIntField(term27681, term27681.getClass(), "size", 0);
        setIntField(term27681, term27681.getClass(), "modCount", 0);
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
        assertTrue(recursiveEquals(term4431, term27697));
        assertTrue(recursiveEquals(retValue, term27681));
    }

};


