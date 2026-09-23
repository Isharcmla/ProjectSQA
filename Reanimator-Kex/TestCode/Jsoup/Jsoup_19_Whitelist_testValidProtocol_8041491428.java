package org.jsoup.safety;

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
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.safety.EqualityUtils.*;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Whitelist_testValidProtocol_8041491428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term745;
     Object term768;
     Object term837;
     Object term862;
     Object term13222;
     Object term13228;
     Object term13233;
     Object term13245;

    public Whitelist_testValidProtocol_8041491428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term747 = new HashMap();
        Set<Object> term13249 =  ((Map) term747).keySet();
        HashSet term746 = new HashSet((Collection<? extends Object>) term13249);
        HashMap term752 = new HashMap();
        HashMap term757 = new HashMap();
        HashMap term762 = new HashMap();
        term745 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term745, term745.getClass(), "tagNames", term746);
        setField(term745, term745.getClass(), "attributes", term752);
        setField(term745, term745.getClass(), "enforcedAttributes", term757);
        setField(term745, term745.getClass(), "protocols", term762);
        setBooleanField(term745, term745.getClass(), "preserveRelativeLinks", false);
        HashMap term790 = new HashMap();
        Set<Object> term13260 =  ((Map) term790).keySet();
        HashSet term789 = new HashSet((Collection<? extends Object>) term13260);
        ArrayList term808 = new ArrayList();
        ((ArrayList) term808).add((Object)null);
        ((ArrayList) term808).add((Object)null);
        LinkedHashMap term813 = new LinkedHashMap();
        term768 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term769 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term812 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term769, term769.getClass(), "tagName", "dWRymuLBtr");
        setBooleanField(term769, term769.getClass(), "isBlock", true);
        setBooleanField(term769, term769.getClass(), "formatAsBlock", true);
        setBooleanField(term769, term769.getClass(), "canContainBlock", false);
        setBooleanField(term769, term769.getClass(), "canContainInline", false);
        setBooleanField(term769, term769.getClass(), "empty", true);
        setBooleanField(term769, term769.getClass(), "selfClosing", true);
        setBooleanField(term769, term769.getClass(), "preserveWhitespace", true);
        setField(term768, term768.getClass(), "tag", term769);
        setField(term768, term768.getClass(), "classNames", term789);
        setField(term768, term768.getClass(), "parentNode", null);
        setField(term768, term768.getClass(), "childNodes", term808);
        setField(term812, term812.getClass(), "attributes", term813);
        setField(term768, term768.getClass(), "attributes", term812);
        setField(term768, term768.getClass(), "baseUri", "UlajhuVLaP");
        setIntField(term768, term768.getClass(), "siblingIndex", 1162663216);
        term837 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term837, term837.getClass(), "key", "gGSMzuGICf");
        setField(term837, term837.getClass(), "value", "hxCBltsObl");
        HashMap term863 = new HashMap();
        Set<Object> term13291 =  ((Map) term863).keySet();
        term862 = new HashSet((Collection<? extends Object>) term13291);
        HashMap term13224 = new HashMap();
        Set<Object> term13292 =  ((Map) term13224).keySet();
        HashSet term13223 = new HashSet((Collection<? extends Object>) term13292);
        HashMap term13225 = new HashMap();
        HashMap term13226 = new HashMap();
        HashMap term13227 = new HashMap();
        term13222 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term13222, term13222.getClass(), "tagNames", term13223);
        setField(term13222, term13222.getClass(), "attributes", term13225);
        setField(term13222, term13222.getClass(), "enforcedAttributes", term13226);
        setField(term13222, term13222.getClass(), "protocols", term13227);
        setBooleanField(term13222, term13222.getClass(), "preserveRelativeLinks", false);
        term13228 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term13228, term13228.getClass(), "key", "gGSMzuGICf");
        setField(term13228, term13228.getClass(), "value", "");
        HashMap term13238 = new HashMap();
        Set<Object> term13313 =  ((Map) term13238).keySet();
        HashSet term13237 = new HashSet((Collection<? extends Object>) term13313);
        ArrayList term13239 = new ArrayList();
        ((ArrayList) term13239).add((Object)null);
        ((ArrayList) term13239).add((Object)null);
        LinkedHashMap term13242 = new LinkedHashMap();
        term13233 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term13234 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term13241 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term13234, term13234.getClass(), "tagName", "dWRymuLBtr");
        setBooleanField(term13234, term13234.getClass(), "isBlock", true);
        setBooleanField(term13234, term13234.getClass(), "formatAsBlock", true);
        setBooleanField(term13234, term13234.getClass(), "canContainBlock", false);
        setBooleanField(term13234, term13234.getClass(), "canContainInline", false);
        setBooleanField(term13234, term13234.getClass(), "empty", true);
        setBooleanField(term13234, term13234.getClass(), "selfClosing", true);
        setBooleanField(term13234, term13234.getClass(), "preserveWhitespace", true);
        setField(term13233, term13233.getClass(), "tag", term13234);
        setField(term13233, term13233.getClass(), "classNames", term13237);
        setField(term13233, term13233.getClass(), "parentNode", null);
        setField(term13233, term13233.getClass(), "childNodes", term13239);
        setField(term13241, term13241.getClass(), "attributes", term13242);
        setField(term13233, term13233.getClass(), "attributes", term13241);
        setField(term13233, term13233.getClass(), "baseUri", "UlajhuVLaP");
        setIntField(term13233, term13233.getClass(), "siblingIndex", 1162663216);
        HashMap term13246 = new HashMap();
        Set<Object> term13324 =  ((Map) term13246).keySet();
        term13245 = new HashSet((Collection<? extends Object>) term13324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Attribute");
        argTypes[2] = Class.forName("java.util.Set");
        Object[] args = new Object[3];
        args[0] = term768;
        args[1] = term837;
        args[2] = term862;
        Object retValue = callMethod(klass, "testValidProtocol", argTypes, term745, args);
        assertTrue(recursiveEquals(term745, term13222));
        assertTrue(recursiveEquals(term768, term13228));
        assertTrue(recursiveEquals(term837, term13233));
        assertTrue(recursiveEquals(term862, term13245));
        assertTrue(recursiveEquals(retValue, false));
    }

};


