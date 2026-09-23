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

public class Element_getElementsByAttributeValueEnding_604542315140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4531;
     Object term26079;
     Object term26074;

    public Element_getElementsByAttributeValueEnding_604542315140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4555 = new HashMap();
        Set<Object> term26105 =  ((Map) term4555).keySet();
        HashSet term4554 = new HashSet((Collection<? extends Object>) term26105);
        ArrayList term4567 = new ArrayList();
        ((ArrayList) term4567).add((Object)null);
        ((ArrayList) term4567).add((Object)null);
        ((ArrayList) term4567).add((Object)null);
        ((ArrayList) term4567).add((Object)null);
        ((ArrayList) term4567).add((Object)null);
        ((ArrayList) term4567).add((Object)null);
        ((ArrayList) term4567).add((Object)null);
        LinkedHashMap term4572 = new LinkedHashMap();
        term4531 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4532 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4571 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4532, term4532.getClass(), "tagName", "fVdTcjgHdw");
        setBooleanField(term4532, term4532.getClass(), "isBlock", false);
        setBooleanField(term4532, term4532.getClass(), "formatAsBlock", true);
        setBooleanField(term4532, term4532.getClass(), "canContainBlock", true);
        setBooleanField(term4532, term4532.getClass(), "canContainInline", false);
        setBooleanField(term4532, term4532.getClass(), "empty", false);
        setBooleanField(term4532, term4532.getClass(), "selfClosing", true);
        setBooleanField(term4532, term4532.getClass(), "preserveWhitespace", true);
        setBooleanField(term4532, term4532.getClass(), "formList", true);
        setBooleanField(term4532, term4532.getClass(), "formSubmit", true);
        setField(term4531, term4531.getClass(), "tag", term4532);
        setField(term4531, term4531.getClass(), "classNames", term4554);
        setField(term4531, term4531.getClass(), "parentNode", null);
        setField(term4531, term4531.getClass(), "childNodes", term4567);
        setField(term4571, term4571.getClass(), "attributes", term4572);
        setField(term4531, term4531.getClass(), "attributes", term4571);
        setField(term4531, term4531.getClass(), "baseUri", "bwlLFAfNWx");
        setIntField(term4531, term4531.getClass(), "siblingIndex", 579005622);
        HashMap term26084 = new HashMap();
        Set<Object> term26146 =  ((Map) term26084).keySet();
        HashSet term26083 = new HashSet((Collection<? extends Object>) term26146);
        ArrayList term26085 = new ArrayList();
        ((ArrayList) term26085).add((Object)null);
        ((ArrayList) term26085).add((Object)null);
        ((ArrayList) term26085).add((Object)null);
        ((ArrayList) term26085).add((Object)null);
        ((ArrayList) term26085).add((Object)null);
        ((ArrayList) term26085).add((Object)null);
        ((ArrayList) term26085).add((Object)null);
        LinkedHashMap term26088 = new LinkedHashMap();
        term26079 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term26080 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term26087 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term26080, term26080.getClass(), "tagName", "fVdTcjgHdw");
        setBooleanField(term26080, term26080.getClass(), "isBlock", false);
        setBooleanField(term26080, term26080.getClass(), "formatAsBlock", true);
        setBooleanField(term26080, term26080.getClass(), "canContainBlock", true);
        setBooleanField(term26080, term26080.getClass(), "canContainInline", false);
        setBooleanField(term26080, term26080.getClass(), "empty", false);
        setBooleanField(term26080, term26080.getClass(), "selfClosing", true);
        setBooleanField(term26080, term26080.getClass(), "preserveWhitespace", true);
        setBooleanField(term26080, term26080.getClass(), "formList", true);
        setBooleanField(term26080, term26080.getClass(), "formSubmit", true);
        setField(term26079, term26079.getClass(), "tag", term26080);
        setField(term26079, term26079.getClass(), "classNames", term26083);
        setField(term26079, term26079.getClass(), "parentNode", null);
        setField(term26079, term26079.getClass(), "childNodes", term26085);
        setField(term26087, term26087.getClass(), "attributes", term26088);
        setField(term26079, term26079.getClass(), "attributes", term26087);
        setField(term26079, term26079.getClass(), "baseUri", "bwlLFAfNWx");
        setIntField(term26079, term26079.getClass(), "siblingIndex", 579005622);
        ArrayList term26075 = new ArrayList();
        term26074 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term26074, term26074.getClass(), "contents", term26075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "JWodNQzjjV";
        args[1] = "CAgxWjhxNf";
        Object retValue = callMethod(klass, "getElementsByAttributeValueEnding", argTypes, term4531, args);
        assertTrue(recursiveEquals(term4531, term26079));
        assertTrue(recursiveEquals(retValue, term26074));
    }

};


