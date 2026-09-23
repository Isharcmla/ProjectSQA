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
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_removeClass_11498692880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6684;

    public Element_removeClass_11498692880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6707 = new ArrayList();
        ((ArrayList) term6707).add((Object)null);
        ((ArrayList) term6707).add((Object)null);
        ((ArrayList) term6707).add((Object)null);
        ((ArrayList) term6707).add((Object)null);
        ((ArrayList) term6707).add((Object)null);
        ((ArrayList) term6707).add((Object)null);
        LinkedHashMap term6712 = new LinkedHashMap();
        term6684 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6685 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6711 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6685, term6685.getClass(), "tagName", "YkZtEtthvz");
        setBooleanField(term6685, term6685.getClass(), "isBlock", true);
        setBooleanField(term6685, term6685.getClass(), "formatAsBlock", true);
        setBooleanField(term6685, term6685.getClass(), "canContainBlock", false);
        setBooleanField(term6685, term6685.getClass(), "canContainInline", true);
        setBooleanField(term6685, term6685.getClass(), "empty", false);
        setBooleanField(term6685, term6685.getClass(), "selfClosing", true);
        setBooleanField(term6685, term6685.getClass(), "preserveWhitespace", false);
        setBooleanField(term6685, term6685.getClass(), "formList", false);
        setBooleanField(term6685, term6685.getClass(), "formSubmit", true);
        setField(term6684, term6684.getClass(), "tag", term6685);
        setField(term6684, term6684.getClass(), "parentNode", null);
        setField(term6684, term6684.getClass(), "childNodes", term6707);
        setField(term6711, term6711.getClass(), "attributes", term6712);
        setField(term6684, term6684.getClass(), "attributes", term6711);
        setField(term6684, term6684.getClass(), "baseUri", "OGQsfjmReM");
        setIntField(term6684, term6684.getClass(), "siblingIndex", 1283079251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YsUtbngnRO";
        callMethod(klass, "removeClass", argTypes, term6684, args);
    }

};


