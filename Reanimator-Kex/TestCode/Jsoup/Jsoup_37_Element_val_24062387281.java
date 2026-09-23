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

public class Element_val_24062387281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7906;

    public Element_val_24062387281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7930 = new HashMap();
        Set<Object> term7979 =  ((Map) term7930).keySet();
        HashSet term7929 = new HashSet((Collection<? extends Object>) term7979);
        ArrayList term7940 = new ArrayList();
        ((ArrayList) term7940).add((Object)null);
        ((ArrayList) term7940).add((Object)null);
        ((ArrayList) term7940).add((Object)null);
        ((ArrayList) term7940).add((Object)null);
        LinkedHashMap term7945 = new LinkedHashMap();
        term7906 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7907 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7944 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7907, term7907.getClass(), "tagName", "dWVwcwFGNo");
        setBooleanField(term7907, term7907.getClass(), "isBlock", true);
        setBooleanField(term7907, term7907.getClass(), "formatAsBlock", true);
        setBooleanField(term7907, term7907.getClass(), "canContainBlock", false);
        setBooleanField(term7907, term7907.getClass(), "canContainInline", true);
        setBooleanField(term7907, term7907.getClass(), "empty", false);
        setBooleanField(term7907, term7907.getClass(), "selfClosing", true);
        setBooleanField(term7907, term7907.getClass(), "preserveWhitespace", false);
        setBooleanField(term7907, term7907.getClass(), "formList", false);
        setBooleanField(term7907, term7907.getClass(), "formSubmit", true);
        setField(term7906, term7906.getClass(), "tag", term7907);
        setField(term7906, term7906.getClass(), "classNames", term7929);
        setField(term7906, term7906.getClass(), "parentNode", null);
        setField(term7906, term7906.getClass(), "childNodes", term7940);
        setField(term7944, term7944.getClass(), "attributes", term7945);
        setField(term7906, term7906.getClass(), "attributes", term7944);
        setField(term7906, term7906.getClass(), "baseUri", "cDOXXottZh");
        setIntField(term7906, term7906.getClass(), "siblingIndex", 628918458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "val", argTypes, term7906, args);
    }

};


