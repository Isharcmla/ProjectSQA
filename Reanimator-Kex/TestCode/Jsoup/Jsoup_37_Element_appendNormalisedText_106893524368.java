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
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;

public class Element_appendNormalisedText_106893524368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6686;
     Object term6706;

    public Element_appendNormalisedText_106893524368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6686 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6687 = (byte[]) newByteArray(16);
        setField(term6686, term6686.getClass(), "value", term6687);
        setByteField(term6686, term6686.getClass(), "coder", (byte) 48);
        setIntField(term6686, term6686.getClass(), "count", 1830648570);
        ArrayList term6719 = new ArrayList();
        ((ArrayList) term6719).add((Object)null);
        ((ArrayList) term6719).add((Object)null);
        ((ArrayList) term6719).add((Object)null);
        LinkedHashMap term6724 = new LinkedHashMap();
        term6706 = newInstance(Class.forName("org.jsoup.nodes.TextNode"));
        Object term6723 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6706, term6706.getClass(), "text", "yIWXcOQTgy");
        setField(term6706, term6706.getClass(), "parentNode", null);
        setField(term6706, term6706.getClass(), "childNodes", term6719);
        setField(term6723, term6723.getClass(), "attributes", term6724);
        setField(term6706, term6706.getClass(), "attributes", term6723);
        setField(term6706, term6706.getClass(), "baseUri", "dAbwpJCDif");
        setIntField(term6706, term6706.getClass(), "siblingIndex", -227365013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("org.jsoup.nodes.TextNode");
        Object[] args = new Object[2];
        args[0] = term6686;
        args[1] = term6706;
        callMethod(klass, "appendNormalisedText", argTypes, null, args);
    }

};


