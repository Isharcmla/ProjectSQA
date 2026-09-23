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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsByAttributeValueNot_183337612345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4223;

    public Element_getElementsByAttributeValueNot_183337612345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4245 = new HashMap();
        Set<Object> term4326 =  ((Map) term4245).keySet();
        HashSet term4244 = new HashSet((Collection<? extends Object>) term4326);
        ArrayList term4263 = new ArrayList();
        ((ArrayList) term4263).add((Object)null);
        ((ArrayList) term4263).add((Object)null);
        ((ArrayList) term4263).add((Object)null);
        ((ArrayList) term4263).add((Object)null);
        ((ArrayList) term4263).add((Object)null);
        ((ArrayList) term4263).add((Object)null);
        LinkedHashMap term4268 = new LinkedHashMap();
        term4223 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4224 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4267 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4224, term4224.getClass(), "tagName", "weddIktxOA");
        setBooleanField(term4224, term4224.getClass(), "isBlock", true);
        setBooleanField(term4224, term4224.getClass(), "formatAsBlock", false);
        setBooleanField(term4224, term4224.getClass(), "canContainBlock", false);
        setBooleanField(term4224, term4224.getClass(), "canContainInline", true);
        setBooleanField(term4224, term4224.getClass(), "empty", true);
        setBooleanField(term4224, term4224.getClass(), "selfClosing", false);
        setBooleanField(term4224, term4224.getClass(), "preserveWhitespace", true);
        setField(term4223, term4223.getClass(), "tag", term4224);
        setField(term4223, term4223.getClass(), "classNames", term4244);
        setField(term4223, term4223.getClass(), "parentNode", null);
        setField(term4223, term4223.getClass(), "childNodes", term4263);
        setField(term4267, term4267.getClass(), "attributes", term4268);
        setField(term4223, term4223.getClass(), "attributes", term4267);
        setField(term4223, term4223.getClass(), "baseUri", "UDlkdccCRn");
        setIntField(term4223, term4223.getClass(), "siblingIndex", -817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "McpzErOcYb";
        args[1] = "jqrVEUvYEz";
        callMethod(klass, "getElementsByAttributeValueNot", argTypes, term4223, args);
    }

};


