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

public class Element_previousElementSibling_125635776434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3093;

    public Element_previousElementSibling_125635776434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3115 = new HashMap();
        Set<Object> term3172 =  ((Map) term3115).keySet();
        HashSet term3114 = new HashSet((Collection<? extends Object>) term3172);
        ArrayList term3133 = new ArrayList();
        ((ArrayList) term3133).add((Object)null);
        ((ArrayList) term3133).add((Object)null);
        ((ArrayList) term3133).add((Object)null);
        ((ArrayList) term3133).add((Object)null);
        ((ArrayList) term3133).add((Object)null);
        ((ArrayList) term3133).add((Object)null);
        LinkedHashMap term3138 = new LinkedHashMap();
        term3093 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3094 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3137 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3094, term3094.getClass(), "tagName", "lZIgPZPgTu");
        setBooleanField(term3094, term3094.getClass(), "isBlock", true);
        setBooleanField(term3094, term3094.getClass(), "formatAsBlock", false);
        setBooleanField(term3094, term3094.getClass(), "canContainBlock", false);
        setBooleanField(term3094, term3094.getClass(), "canContainInline", true);
        setBooleanField(term3094, term3094.getClass(), "empty", false);
        setBooleanField(term3094, term3094.getClass(), "selfClosing", false);
        setBooleanField(term3094, term3094.getClass(), "preserveWhitespace", true);
        setField(term3093, term3093.getClass(), "tag", term3094);
        setField(term3093, term3093.getClass(), "classNames", term3114);
        setField(term3093, term3093.getClass(), "parentNode", null);
        setField(term3093, term3093.getClass(), "childNodes", term3133);
        setField(term3137, term3137.getClass(), "attributes", term3138);
        setField(term3093, term3093.getClass(), "attributes", term3137);
        setField(term3093, term3093.getClass(), "baseUri", "VDokbsCuqq");
        setIntField(term3093, term3093.getClass(), "siblingIndex", -226514366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "previousElementSibling", argTypes, term3093, args);
    }

};


