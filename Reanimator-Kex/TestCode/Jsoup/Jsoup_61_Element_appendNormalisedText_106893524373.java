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

public class Element_appendNormalisedText_106893524373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6022;
     Object term6042;

    public Element_appendNormalisedText_106893524373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6022 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6023 = (byte[]) newByteArray(16);
        setField(term6022, term6022.getClass(), "value", term6023);
        setByteField(term6022, term6022.getClass(), "coder", (byte) 48);
        setIntField(term6022, term6022.getClass(), "count", 229204365);
        ArrayList term6055 = new ArrayList();
        ((ArrayList) term6055).add((Object)null);
        ((ArrayList) term6055).add((Object)null);
        ((ArrayList) term6055).add((Object)null);
        ((ArrayList) term6055).add((Object)null);
        ((ArrayList) term6055).add((Object)null);
        ((ArrayList) term6055).add((Object)null);
        ((ArrayList) term6055).add((Object)null);
        ((ArrayList) term6055).add((Object)null);
        LinkedHashMap term6060 = new LinkedHashMap();
        term6042 = newInstance(Class.forName("org.jsoup.nodes.TextNode"));
        Object term6059 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6042, term6042.getClass(), "text", "OzXRsFGTIp");
        setField(term6042, term6042.getClass(), "parentNode", null);
        setField(term6042, term6042.getClass(), "childNodes", term6055);
        setField(term6059, term6059.getClass(), "attributes", term6060);
        setField(term6042, term6042.getClass(), "attributes", term6059);
        setField(term6042, term6042.getClass(), "baseUri", "IkpjUOuWQU");
        setIntField(term6042, term6042.getClass(), "siblingIndex", -461771056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("org.jsoup.nodes.TextNode");
        Object[] args = new Object[2];
        args[0] = term6022;
        args[1] = term6042;
        callMethod(klass, "appendNormalisedText", argTypes, null, args);
    }

};


