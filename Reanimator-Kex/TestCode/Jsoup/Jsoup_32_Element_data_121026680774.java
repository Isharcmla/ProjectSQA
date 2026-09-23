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

public class Element_data_121026680774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7270;

    public Element_data_121026680774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7292 = new HashMap();
        Set<Object> term7341 =  ((Map) term7292).keySet();
        HashSet term7291 = new HashSet((Collection<? extends Object>) term7341);
        ArrayList term7302 = new ArrayList();
        LinkedHashMap term7307 = new LinkedHashMap();
        term7270 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7271 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7306 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7271, term7271.getClass(), "tagName", "FlxVmiMYKP");
        setBooleanField(term7271, term7271.getClass(), "isBlock", true);
        setBooleanField(term7271, term7271.getClass(), "formatAsBlock", true);
        setBooleanField(term7271, term7271.getClass(), "canContainBlock", false);
        setBooleanField(term7271, term7271.getClass(), "canContainInline", true);
        setBooleanField(term7271, term7271.getClass(), "empty", true);
        setBooleanField(term7271, term7271.getClass(), "selfClosing", false);
        setBooleanField(term7271, term7271.getClass(), "preserveWhitespace", false);
        setField(term7270, term7270.getClass(), "tag", term7271);
        setField(term7270, term7270.getClass(), "classNames", term7291);
        setField(term7270, term7270.getClass(), "parentNode", null);
        setField(term7270, term7270.getClass(), "childNodes", term7302);
        setField(term7306, term7306.getClass(), "attributes", term7307);
        setField(term7270, term7270.getClass(), "attributes", term7306);
        setField(term7270, term7270.getClass(), "baseUri", "BMMonTIZgJ");
        setIntField(term7270, term7270.getClass(), "siblingIndex", 1384592638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "data", argTypes, term7270, args);
    }

};


