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

public class Element_tag_1534893321120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term780;
     Object term11036;
     Object term10989;

    public Element_tag_1534893321120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term806 = new ArrayList();
        ((ArrayList) term806).add((Object)null);
        term780 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term781 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term802 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term803 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term804 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term810 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term812 = (Object[]) newArray("java.lang.String", 0);
        Object[] term813 = (Object[]) newArray("java.lang.String", 0);
        setField(term781, term781.getClass(), "tagName", "vrQLuWIDJX");
        setBooleanField(term781, term781.getClass(), "isBlock", true);
        setBooleanField(term781, term781.getClass(), "formatAsBlock", true);
        setBooleanField(term781, term781.getClass(), "canContainInline", true);
        setBooleanField(term781, term781.getClass(), "empty", true);
        setBooleanField(term781, term781.getClass(), "selfClosing", false);
        setBooleanField(term781, term781.getClass(), "preserveWhitespace", false);
        setBooleanField(term781, term781.getClass(), "formList", true);
        setBooleanField(term781, term781.getClass(), "formSubmit", true);
        setField(term780, term780.getClass(), "tag", term781);
        setField(term802, term802.getClass(), "referent", null);
        setField(term803, term803.getClass(), "lock", term804);
        setField(term803, term803.getClass(), "head", null);
        setLongField(term803, term803.getClass(), "queueLength", 6967924379644551255L);
        setField(term802, term802.getClass(), "queue", term803);
        setField(term802, term802.getClass(), "next", null);
        setField(term802, term802.getClass(), "discovered", null);
        setField(term780, term780.getClass(), "shadowChildrenRef", term802);
        setField(term780, term780.getClass(), "childNodes", term806);
        setIntField(term810, term810.getClass(), "size", 1048535127);
        setField(term810, term810.getClass(), "keys", term812);
        setField(term810, term810.getClass(), "vals", term813);
        setField(term780, term780.getClass(), "attributes", term810);
        setField(term780, term780.getClass(), "baseUri", "flxyYxBRtu");
        setField(term780, term780.getClass(), "parentNode", null);
        setIntField(term780, term780.getClass(), "siblingIndex", -655067527);
        ArrayList term11043 = new ArrayList();
        ((ArrayList) term11043).add((Object)null);
        term11036 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term11037 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11040 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term11041 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term11042 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term11045 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term11046 = (Object[]) newArray("java.lang.String", 0);
        Object[] term11047 = (Object[]) newArray("java.lang.String", 0);
        setField(term11037, term11037.getClass(), "tagName", "vrQLuWIDJX");
        setBooleanField(term11037, term11037.getClass(), "isBlock", true);
        setBooleanField(term11037, term11037.getClass(), "formatAsBlock", true);
        setBooleanField(term11037, term11037.getClass(), "canContainInline", true);
        setBooleanField(term11037, term11037.getClass(), "empty", true);
        setBooleanField(term11037, term11037.getClass(), "selfClosing", false);
        setBooleanField(term11037, term11037.getClass(), "preserveWhitespace", false);
        setBooleanField(term11037, term11037.getClass(), "formList", true);
        setBooleanField(term11037, term11037.getClass(), "formSubmit", true);
        setField(term11036, term11036.getClass(), "tag", term11037);
        setField(term11040, term11040.getClass(), "referent", null);
        setField(term11041, term11041.getClass(), "lock", term11042);
        setField(term11041, term11041.getClass(), "head", null);
        setLongField(term11041, term11041.getClass(), "queueLength", 6967924379644551255L);
        setField(term11040, term11040.getClass(), "queue", term11041);
        setField(term11040, term11040.getClass(), "next", null);
        setField(term11040, term11040.getClass(), "discovered", null);
        setField(term11036, term11036.getClass(), "shadowChildrenRef", term11040);
        setField(term11036, term11036.getClass(), "childNodes", term11043);
        setIntField(term11045, term11045.getClass(), "size", 1048535127);
        setField(term11045, term11045.getClass(), "keys", term11046);
        setField(term11045, term11045.getClass(), "vals", term11047);
        setField(term11036, term11036.getClass(), "attributes", term11045);
        setField(term11036, term11036.getClass(), "baseUri", "flxyYxBRtu");
        setField(term11036, term11036.getClass(), "parentNode", null);
        setIntField(term11036, term11036.getClass(), "siblingIndex", -655067527);
        term10989 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10989, term10989.getClass(), "tagName", "vrQLuWIDJX");
        setBooleanField(term10989, term10989.getClass(), "isBlock", true);
        setBooleanField(term10989, term10989.getClass(), "formatAsBlock", true);
        setBooleanField(term10989, term10989.getClass(), "canContainInline", true);
        setBooleanField(term10989, term10989.getClass(), "empty", true);
        setBooleanField(term10989, term10989.getClass(), "selfClosing", false);
        setBooleanField(term10989, term10989.getClass(), "preserveWhitespace", false);
        setBooleanField(term10989, term10989.getClass(), "formList", true);
        setBooleanField(term10989, term10989.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tag", argTypes, term780, args);
        assertTrue(recursiveEquals(term780, term11036));
        assertTrue(recursiveEquals(retValue, term10989));
    }

};


