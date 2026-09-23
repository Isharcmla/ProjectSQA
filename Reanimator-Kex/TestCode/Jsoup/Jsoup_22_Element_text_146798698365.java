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

public class Element_text_146798698365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6411;
     Object term6478;

    public Element_text_146798698365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6433 = new HashMap();
        Set<Object> term6508 =  ((Map) term6433).keySet();
        HashSet term6432 = new HashSet((Collection<? extends Object>) term6508);
        ArrayList term6449 = new ArrayList();
        ((ArrayList) term6449).add((Object)null);
        ((ArrayList) term6449).add((Object)null);
        ((ArrayList) term6449).add((Object)null);
        LinkedHashMap term6454 = new LinkedHashMap();
        term6411 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6412 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6453 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6412, term6412.getClass(), "tagName", "PtIjKpiSix");
        setBooleanField(term6412, term6412.getClass(), "isBlock", false);
        setBooleanField(term6412, term6412.getClass(), "formatAsBlock", false);
        setBooleanField(term6412, term6412.getClass(), "canContainBlock", true);
        setBooleanField(term6412, term6412.getClass(), "canContainInline", false);
        setBooleanField(term6412, term6412.getClass(), "empty", false);
        setBooleanField(term6412, term6412.getClass(), "selfClosing", true);
        setBooleanField(term6412, term6412.getClass(), "preserveWhitespace", true);
        setField(term6411, term6411.getClass(), "tag", term6412);
        setField(term6411, term6411.getClass(), "classNames", term6432);
        setField(term6411, term6411.getClass(), "parentNode", null);
        setField(term6411, term6411.getClass(), "childNodes", term6449);
        setField(term6453, term6453.getClass(), "attributes", term6454);
        setField(term6411, term6411.getClass(), "attributes", term6453);
        setField(term6411, term6411.getClass(), "baseUri", "zyZTzHNjQr");
        setIntField(term6411, term6411.getClass(), "siblingIndex", -1388471422);
        term6478 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6479 = (byte[]) newByteArray(16);
        setField(term6478, term6478.getClass(), "value", term6479);
        setByteField(term6478, term6478.getClass(), "coder", (byte) 47);
        setIntField(term6478, term6478.getClass(), "count", -1498296052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term6478;
        callMethod(klass, "text", argTypes, term6411, args);
    }

};


