package org.jsoup.parser;

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
import java.lang.NoClassDefFoundError;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Parser_parseFragment_60304098521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;

    public Parser_parseFragment_60304098521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term161 = new HashMap();
        Set<Object> term1835 =  ((Map) term161).keySet();
        HashSet term160 = new HashSet((Collection<? extends Object>) term1835);
        ArrayList term171 = new ArrayList();
        ((ArrayList) term171).add((Object)null);
        ((ArrayList) term171).add((Object)null);
        ((ArrayList) term171).add((Object)null);
        ((ArrayList) term171).add((Object)null);
        ((ArrayList) term171).add((Object)null);
        ((ArrayList) term171).add((Object)null);
        LinkedHashMap term176 = new LinkedHashMap();
        term139 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term140 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term175 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term140, term140.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term140, term140.getClass(), "isBlock", false);
        setBooleanField(term140, term140.getClass(), "formatAsBlock", false);
        setBooleanField(term140, term140.getClass(), "canContainBlock", false);
        setBooleanField(term140, term140.getClass(), "canContainInline", false);
        setBooleanField(term140, term140.getClass(), "empty", true);
        setBooleanField(term140, term140.getClass(), "selfClosing", true);
        setBooleanField(term140, term140.getClass(), "preserveWhitespace", true);
        setField(term139, term139.getClass(), "tag", term140);
        setField(term139, term139.getClass(), "classNames", term160);
        setField(term139, term139.getClass(), "parentNode", null);
        setField(term139, term139.getClass(), "childNodes", term171);
        setField(term175, term175.getClass(), "attributes", term176);
        setField(term139, term139.getClass(), "attributes", term175);
        setField(term139, term139.getClass(), "baseUri", "uuaPigETmJ");
        setIntField(term139, term139.getClass(), "siblingIndex", -883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "jJCZpVmanW";
        args[1] = term139;
        args[2] = "MxlszYVzRf";
        try {
            callMethod(klass, "parseFragment", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


