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

public class Element_firstElementSibling_109811962735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3183;

    public Element_firstElementSibling_109811962735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3205 = new HashMap();
        Set<Object> term3249 =  ((Map) term3205).keySet();
        HashSet term3204 = new HashSet((Collection<? extends Object>) term3249);
        ArrayList term3210 = new ArrayList();
        ((ArrayList) term3210).add((Object)null);
        ((ArrayList) term3210).add((Object)null);
        ((ArrayList) term3210).add((Object)null);
        ((ArrayList) term3210).add((Object)null);
        ((ArrayList) term3210).add((Object)null);
        ((ArrayList) term3210).add((Object)null);
        LinkedHashMap term3215 = new LinkedHashMap();
        term3183 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3184 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3214 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3184, term3184.getClass(), "tagName", "xClUIcPECX");
        setBooleanField(term3184, term3184.getClass(), "isBlock", false);
        setBooleanField(term3184, term3184.getClass(), "formatAsBlock", false);
        setBooleanField(term3184, term3184.getClass(), "canContainBlock", false);
        setBooleanField(term3184, term3184.getClass(), "canContainInline", false);
        setBooleanField(term3184, term3184.getClass(), "empty", false);
        setBooleanField(term3184, term3184.getClass(), "selfClosing", false);
        setBooleanField(term3184, term3184.getClass(), "preserveWhitespace", false);
        setField(term3183, term3183.getClass(), "tag", term3184);
        setField(term3183, term3183.getClass(), "classNames", term3204);
        setField(term3183, term3183.getClass(), "parentNode", null);
        setField(term3183, term3183.getClass(), "childNodes", term3210);
        setField(term3214, term3214.getClass(), "attributes", term3215);
        setField(term3183, term3183.getClass(), "attributes", term3214);
        setField(term3183, term3183.getClass(), "baseUri", "IHqvyhMtuM");
        setIntField(term3183, term3183.getClass(), "siblingIndex", 1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "firstElementSibling", argTypes, term3183, args);
    }

};


