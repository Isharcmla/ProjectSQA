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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_html_1137954597131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7158;
     Object term7218;

    public Element_html_1137954597131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7178 = new ArrayList();
        HashMap term7183 = new HashMap();
        Set<Object> term53913 =  ((Map) term7183).keySet();
        HashSet term7182 = new HashSet((Collection<? extends Object>) term53913);
        ArrayList term7195 = new ArrayList();
        ((ArrayList) term7195).add((Object)null);
        ((ArrayList) term7195).add((Object)null);
        LinkedHashMap term7200 = new LinkedHashMap();
        term7158 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7159 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7199 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7159, term7159.getClass(), "tagName", "NTXQPWFYSA");
        setBooleanField(term7159, term7159.getClass(), "isBlock", true);
        setBooleanField(term7159, term7159.getClass(), "canContainBlock", true);
        setBooleanField(term7159, term7159.getClass(), "canContainInline", true);
        setBooleanField(term7159, term7159.getClass(), "optionalClosing", false);
        setBooleanField(term7159, term7159.getClass(), "empty", true);
        setBooleanField(term7159, term7159.getClass(), "preserveWhitespace", false);
        setField(term7159, term7159.getClass(), "ancestors", term7178);
        setField(term7158, term7158.getClass(), "tag", term7159);
        setField(term7158, term7158.getClass(), "classNames", term7182);
        setField(term7158, term7158.getClass(), "parentNode", null);
        setField(term7158, term7158.getClass(), "childNodes", term7195);
        setField(term7199, term7199.getClass(), "attributes", term7200);
        setField(term7158, term7158.getClass(), "attributes", term7199);
        setField(term7158, term7158.getClass(), "baseUri", "bsnZXGEvFv");
        term7218 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7219 = (byte[]) newByteArray(16);
        setField(term7218, term7218.getClass(), "value", term7219);
        setByteField(term7218, term7218.getClass(), "coder", (byte) 89);
        setIntField(term7218, term7218.getClass(), "count", -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term7218;
        try {
            callMethod(klass, "html", argTypes, term7158, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


