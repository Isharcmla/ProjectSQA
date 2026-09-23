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

public class Element_getElementsByAttributeValueMatching_1502127233144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4929;
     Object term28194;
     Object term28177;

    public Element_getElementsByAttributeValueMatching_1502127233144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4951 = new HashMap();
        Set<Object> term28220 =  ((Map) term4951).keySet();
        HashSet term4950 = new HashSet((Collection<? extends Object>) term28220);
        ArrayList term4956 = new ArrayList();
        ((ArrayList) term4956).add((Object)null);
        LinkedHashMap term4961 = new LinkedHashMap();
        term4929 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4930 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4960 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4930, term4930.getClass(), "tagName", "ZUdnQXfzCI");
        setBooleanField(term4930, term4930.getClass(), "isBlock", false);
        setBooleanField(term4930, term4930.getClass(), "formatAsBlock", true);
        setBooleanField(term4930, term4930.getClass(), "canContainBlock", true);
        setBooleanField(term4930, term4930.getClass(), "canContainInline", true);
        setBooleanField(term4930, term4930.getClass(), "empty", false);
        setBooleanField(term4930, term4930.getClass(), "selfClosing", true);
        setBooleanField(term4930, term4930.getClass(), "preserveWhitespace", true);
        setField(term4929, term4929.getClass(), "tag", term4930);
        setField(term4929, term4929.getClass(), "classNames", term4950);
        setField(term4929, term4929.getClass(), "parentNode", null);
        setField(term4929, term4929.getClass(), "childNodes", term4956);
        setField(term4960, term4960.getClass(), "attributes", term4961);
        setField(term4929, term4929.getClass(), "attributes", term4960);
        setField(term4929, term4929.getClass(), "baseUri", "bycpZjxXFn");
        setIntField(term4929, term4929.getClass(), "siblingIndex", 1265463001);
        HashMap term28199 = new HashMap();
        Set<Object> term28261 =  ((Map) term28199).keySet();
        HashSet term28198 = new HashSet((Collection<? extends Object>) term28261);
        ArrayList term28200 = new ArrayList();
        ((ArrayList) term28200).add((Object)null);
        LinkedHashMap term28203 = new LinkedHashMap();
        term28194 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term28195 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term28202 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term28195, term28195.getClass(), "tagName", "ZUdnQXfzCI");
        setBooleanField(term28195, term28195.getClass(), "isBlock", false);
        setBooleanField(term28195, term28195.getClass(), "formatAsBlock", true);
        setBooleanField(term28195, term28195.getClass(), "canContainBlock", true);
        setBooleanField(term28195, term28195.getClass(), "canContainInline", true);
        setBooleanField(term28195, term28195.getClass(), "empty", false);
        setBooleanField(term28195, term28195.getClass(), "selfClosing", true);
        setBooleanField(term28195, term28195.getClass(), "preserveWhitespace", true);
        setField(term28194, term28194.getClass(), "tag", term28195);
        setField(term28194, term28194.getClass(), "classNames", term28198);
        setField(term28194, term28194.getClass(), "parentNode", null);
        setField(term28194, term28194.getClass(), "childNodes", term28200);
        setField(term28202, term28202.getClass(), "attributes", term28203);
        setField(term28194, term28194.getClass(), "attributes", term28202);
        setField(term28194, term28194.getClass(), "baseUri", "bycpZjxXFn");
        setIntField(term28194, term28194.getClass(), "siblingIndex", 1265463001);
        ArrayList term28178 = new ArrayList();
        term28177 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term28177, term28177.getClass(), "contents", term28178);
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
        Object retValue = callMethod(klass, "getElementsByAttributeValueMatching", argTypes, term4929, args);
        assertTrue(recursiveEquals(term4929, term28194));
        assertTrue(recursiveEquals(retValue, term28177));
    }

};


