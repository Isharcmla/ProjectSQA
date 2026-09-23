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

public class Element_cssSelector_1341485919133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2766;
     Object term20862;

    public Element_cssSelector_1341485919133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2788 = new ArrayList();
        ((ArrayList) term2788).add((Object)null);
        ((ArrayList) term2788).add((Object)null);
        ((ArrayList) term2788).add((Object)null);
        LinkedHashMap term2793 = new LinkedHashMap();
        term2766 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2767 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2792 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2767, term2767.getClass(), "tagName", "tRxZafjqIx");
        setBooleanField(term2767, term2767.getClass(), "isBlock", true);
        setBooleanField(term2767, term2767.getClass(), "formatAsBlock", true);
        setBooleanField(term2767, term2767.getClass(), "canContainInline", false);
        setBooleanField(term2767, term2767.getClass(), "empty", false);
        setBooleanField(term2767, term2767.getClass(), "selfClosing", false);
        setBooleanField(term2767, term2767.getClass(), "preserveWhitespace", true);
        setBooleanField(term2767, term2767.getClass(), "formList", true);
        setBooleanField(term2767, term2767.getClass(), "formSubmit", false);
        setField(term2766, term2766.getClass(), "tag", term2767);
        setField(term2766, term2766.getClass(), "parentNode", null);
        setField(term2766, term2766.getClass(), "childNodes", term2788);
        setField(term2792, term2792.getClass(), "attributes", term2793);
        setField(term2766, term2766.getClass(), "attributes", term2792);
        setField(term2766, term2766.getClass(), "baseUri", "kGMQdqJYyB");
        setIntField(term2766, term2766.getClass(), "siblingIndex", -1530420153);
        ArrayList term20866 = new ArrayList();
        ((ArrayList) term20866).add((Object)null);
        ((ArrayList) term20866).add((Object)null);
        ((ArrayList) term20866).add((Object)null);
        LinkedHashMap term20869 = new LinkedHashMap();
        term20862 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20863 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20868 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20863, term20863.getClass(), "tagName", "tRxZafjqIx");
        setBooleanField(term20863, term20863.getClass(), "isBlock", true);
        setBooleanField(term20863, term20863.getClass(), "formatAsBlock", true);
        setBooleanField(term20863, term20863.getClass(), "canContainInline", false);
        setBooleanField(term20863, term20863.getClass(), "empty", false);
        setBooleanField(term20863, term20863.getClass(), "selfClosing", false);
        setBooleanField(term20863, term20863.getClass(), "preserveWhitespace", true);
        setBooleanField(term20863, term20863.getClass(), "formList", true);
        setBooleanField(term20863, term20863.getClass(), "formSubmit", false);
        setField(term20862, term20862.getClass(), "tag", term20863);
        setField(term20862, term20862.getClass(), "parentNode", null);
        setField(term20862, term20862.getClass(), "childNodes", term20866);
        setField(term20868, term20868.getClass(), "attributes", term20869);
        setField(term20862, term20862.getClass(), "attributes", term20868);
        setField(term20862, term20862.getClass(), "baseUri", "kGMQdqJYyB");
        setIntField(term20862, term20862.getClass(), "siblingIndex", -1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "cssSelector", argTypes, term2766, args);
        assertTrue(recursiveEquals(term2766, term20862));
        assertTrue(recursiveEquals(retValue, "tRxZafjqIx"));
    }

};


