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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsByAttributeValueMatching_1502127233143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5027;
     Object term28326;
     Object term28309;

    public Element_getElementsByAttributeValueMatching_1502127233143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5051 = new HashMap();
        Set<Object> term28352 =  ((Map) term5051).keySet();
        HashSet term5050 = new HashSet((Collection<? extends Object>) term28352);
        ArrayList term5056 = new ArrayList();
        ((ArrayList) term5056).add((Object)null);
        LinkedHashMap term5061 = new LinkedHashMap();
        term5027 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5028 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5060 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5028, term5028.getClass(), "tagName", "ZUdnQXfzCI");
        setBooleanField(term5028, term5028.getClass(), "isBlock", true);
        setBooleanField(term5028, term5028.getClass(), "formatAsBlock", false);
        setBooleanField(term5028, term5028.getClass(), "canContainBlock", true);
        setBooleanField(term5028, term5028.getClass(), "canContainInline", false);
        setBooleanField(term5028, term5028.getClass(), "empty", false);
        setBooleanField(term5028, term5028.getClass(), "selfClosing", true);
        setBooleanField(term5028, term5028.getClass(), "preserveWhitespace", true);
        setBooleanField(term5028, term5028.getClass(), "formList", false);
        setBooleanField(term5028, term5028.getClass(), "formSubmit", true);
        setField(term5027, term5027.getClass(), "tag", term5028);
        setField(term5027, term5027.getClass(), "classNames", term5050);
        setField(term5027, term5027.getClass(), "parentNode", null);
        setField(term5027, term5027.getClass(), "childNodes", term5056);
        setField(term5060, term5060.getClass(), "attributes", term5061);
        setField(term5027, term5027.getClass(), "attributes", term5060);
        setField(term5027, term5027.getClass(), "baseUri", "bycpZjxXFn");
        setIntField(term5027, term5027.getClass(), "siblingIndex", 1265463001);
        HashMap term28331 = new HashMap();
        Set<Object> term28393 =  ((Map) term28331).keySet();
        HashSet term28330 = new HashSet((Collection<? extends Object>) term28393);
        ArrayList term28332 = new ArrayList();
        ((ArrayList) term28332).add((Object)null);
        LinkedHashMap term28335 = new LinkedHashMap();
        term28326 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term28327 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term28334 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term28327, term28327.getClass(), "tagName", "ZUdnQXfzCI");
        setBooleanField(term28327, term28327.getClass(), "isBlock", true);
        setBooleanField(term28327, term28327.getClass(), "formatAsBlock", false);
        setBooleanField(term28327, term28327.getClass(), "canContainBlock", true);
        setBooleanField(term28327, term28327.getClass(), "canContainInline", false);
        setBooleanField(term28327, term28327.getClass(), "empty", false);
        setBooleanField(term28327, term28327.getClass(), "selfClosing", true);
        setBooleanField(term28327, term28327.getClass(), "preserveWhitespace", true);
        setBooleanField(term28327, term28327.getClass(), "formList", false);
        setBooleanField(term28327, term28327.getClass(), "formSubmit", true);
        setField(term28326, term28326.getClass(), "tag", term28327);
        setField(term28326, term28326.getClass(), "classNames", term28330);
        setField(term28326, term28326.getClass(), "parentNode", null);
        setField(term28326, term28326.getClass(), "childNodes", term28332);
        setField(term28334, term28334.getClass(), "attributes", term28335);
        setField(term28326, term28326.getClass(), "attributes", term28334);
        setField(term28326, term28326.getClass(), "baseUri", "bycpZjxXFn");
        setIntField(term28326, term28326.getClass(), "siblingIndex", 1265463001);
        ArrayList term28310 = new ArrayList();
        term28309 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term28309, term28309.getClass(), "contents", term28310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "jQWttOAiwL";
        args[1] = "DzKFxEuEEC";
        Object retValue = callMethod(klass, "getElementsByAttributeValueMatching", argTypes, term5027, args);
        assertTrue(recursiveEquals(term5027, term28326));
        assertTrue(recursiveEquals(retValue, term28309));
    }

};


