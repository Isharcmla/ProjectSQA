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

public class Element_appendNormalisedText_106893524369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5829;
     Object term5849;

    public Element_appendNormalisedText_106893524369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5829 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5830 = (byte[]) newByteArray(16);
        setField(term5829, term5829.getClass(), "value", term5830);
        setByteField(term5829, term5829.getClass(), "coder", (byte) 48);
        setIntField(term5829, term5829.getClass(), "count", 158873461);
        ArrayList term5862 = new ArrayList();
        ((ArrayList) term5862).add((Object)null);
        ((ArrayList) term5862).add((Object)null);
        ((ArrayList) term5862).add((Object)null);
        ((ArrayList) term5862).add((Object)null);
        ((ArrayList) term5862).add((Object)null);
        ((ArrayList) term5862).add((Object)null);
        ((ArrayList) term5862).add((Object)null);
        ((ArrayList) term5862).add((Object)null);
        LinkedHashMap term5867 = new LinkedHashMap();
        term5849 = newInstance(Class.forName("org.jsoup.nodes.TextNode"));
        Object term5866 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5849, term5849.getClass(), "text", "bdyhHbDAmJ");
        setField(term5849, term5849.getClass(), "parentNode", null);
        setField(term5849, term5849.getClass(), "childNodes", term5862);
        setField(term5866, term5866.getClass(), "attributes", term5867);
        setField(term5849, term5849.getClass(), "attributes", term5866);
        setField(term5849, term5849.getClass(), "baseUri", "qUtkFGMNUV");
        setIntField(term5849, term5849.getClass(), "siblingIndex", -430151637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("org.jsoup.nodes.TextNode");
        Object[] args = new Object[2];
        args[0] = term5829;
        args[1] = term5849;
        callMethod(klass, "appendNormalisedText", argTypes, null, args);
    }

};


