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

public class Element_ownText_186502842968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6560;
     Object term6623;

    public Element_ownText_186502842968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6582 = new HashMap();
        Set<Object> term6653 =  ((Map) term6582).keySet();
        HashSet term6581 = new HashSet((Collection<? extends Object>) term6653);
        ArrayList term6594 = new ArrayList();
        ((ArrayList) term6594).add((Object)null);
        ((ArrayList) term6594).add((Object)null);
        ((ArrayList) term6594).add((Object)null);
        ((ArrayList) term6594).add((Object)null);
        LinkedHashMap term6599 = new LinkedHashMap();
        term6560 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6561 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6598 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6561, term6561.getClass(), "tagName", "yIWXcOQTgy");
        setBooleanField(term6561, term6561.getClass(), "isBlock", true);
        setBooleanField(term6561, term6561.getClass(), "formatAsBlock", false);
        setBooleanField(term6561, term6561.getClass(), "canContainBlock", false);
        setBooleanField(term6561, term6561.getClass(), "canContainInline", true);
        setBooleanField(term6561, term6561.getClass(), "empty", true);
        setBooleanField(term6561, term6561.getClass(), "selfClosing", false);
        setBooleanField(term6561, term6561.getClass(), "preserveWhitespace", true);
        setField(term6560, term6560.getClass(), "tag", term6561);
        setField(term6560, term6560.getClass(), "classNames", term6581);
        setField(term6560, term6560.getClass(), "parentNode", null);
        setField(term6560, term6560.getClass(), "childNodes", term6594);
        setField(term6598, term6598.getClass(), "attributes", term6599);
        setField(term6560, term6560.getClass(), "attributes", term6598);
        setField(term6560, term6560.getClass(), "baseUri", "TGiJfagfky");
        setIntField(term6560, term6560.getClass(), "siblingIndex", 1830648570);
        term6623 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6624 = (byte[]) newByteArray(16);
        setField(term6623, term6623.getClass(), "value", term6624);
        setByteField(term6623, term6623.getClass(), "coder", (byte) 48);
        setIntField(term6623, term6623.getClass(), "count", -227365013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term6623;
        callMethod(klass, "ownText", argTypes, term6560, args);
    }

};


