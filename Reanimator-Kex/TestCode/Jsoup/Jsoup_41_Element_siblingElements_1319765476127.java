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

public class Element_siblingElements_1319765476127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2588;
     Object term19473;
     Object term19422;

    public Element_siblingElements_1319765476127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2611 = new ArrayList();
        ((ArrayList) term2611).add((Object)null);
        ((ArrayList) term2611).add((Object)null);
        LinkedHashMap term2616 = new LinkedHashMap();
        term2588 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2589 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2615 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2589, term2589.getClass(), "tagName", "DyiXbeYIaN");
        setBooleanField(term2589, term2589.getClass(), "isBlock", false);
        setBooleanField(term2589, term2589.getClass(), "formatAsBlock", false);
        setBooleanField(term2589, term2589.getClass(), "canContainBlock", true);
        setBooleanField(term2589, term2589.getClass(), "canContainInline", true);
        setBooleanField(term2589, term2589.getClass(), "empty", true);
        setBooleanField(term2589, term2589.getClass(), "selfClosing", true);
        setBooleanField(term2589, term2589.getClass(), "preserveWhitespace", true);
        setBooleanField(term2589, term2589.getClass(), "formList", false);
        setBooleanField(term2589, term2589.getClass(), "formSubmit", true);
        setField(term2588, term2588.getClass(), "tag", term2589);
        setField(term2588, term2588.getClass(), "parentNode", null);
        setField(term2588, term2588.getClass(), "childNodes", term2611);
        setField(term2615, term2615.getClass(), "attributes", term2616);
        setField(term2588, term2588.getClass(), "attributes", term2615);
        setField(term2588, term2588.getClass(), "baseUri", "RbVQXSpxXy");
        setIntField(term2588, term2588.getClass(), "siblingIndex", 1193880199);
        ArrayList term19477 = new ArrayList();
        ((ArrayList) term19477).add((Object)null);
        ((ArrayList) term19477).add((Object)null);
        LinkedHashMap term19480 = new LinkedHashMap();
        term19473 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19474 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19479 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19474, term19474.getClass(), "tagName", "DyiXbeYIaN");
        setBooleanField(term19474, term19474.getClass(), "isBlock", false);
        setBooleanField(term19474, term19474.getClass(), "formatAsBlock", false);
        setBooleanField(term19474, term19474.getClass(), "canContainBlock", true);
        setBooleanField(term19474, term19474.getClass(), "canContainInline", true);
        setBooleanField(term19474, term19474.getClass(), "empty", true);
        setBooleanField(term19474, term19474.getClass(), "selfClosing", true);
        setBooleanField(term19474, term19474.getClass(), "preserveWhitespace", true);
        setBooleanField(term19474, term19474.getClass(), "formList", false);
        setBooleanField(term19474, term19474.getClass(), "formSubmit", true);
        setField(term19473, term19473.getClass(), "tag", term19474);
        setField(term19473, term19473.getClass(), "parentNode", null);
        setField(term19473, term19473.getClass(), "childNodes", term19477);
        setField(term19479, term19479.getClass(), "attributes", term19480);
        setField(term19473, term19473.getClass(), "attributes", term19479);
        setField(term19473, term19473.getClass(), "baseUri", "RbVQXSpxXy");
        setIntField(term19473, term19473.getClass(), "siblingIndex", 1193880199);
        term19422 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term19423 = (Object[]) newArray("java.lang.Object", 0);
        setField(term19422, term19422.getClass(), "elementData", term19423);
        setIntField(term19422, term19422.getClass(), "size", 0);
        setIntField(term19422, term19422.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "siblingElements", argTypes, term2588, args);
        assertTrue(recursiveEquals(term2588, term19473));
        assertTrue(recursiveEquals(retValue, term19422));
    }

};


