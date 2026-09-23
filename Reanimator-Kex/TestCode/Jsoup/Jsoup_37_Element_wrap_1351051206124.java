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
import java.lang.NoClassDefFoundError;
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

public class Element_wrap_1351051206124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2863;

    public Element_wrap_1351051206124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2887 = new HashMap();
        Set<Object> term19800 =  ((Map) term2887).keySet();
        HashSet term2886 = new HashSet((Collection<? extends Object>) term19800);
        ArrayList term2905 = new ArrayList();
        ((ArrayList) term2905).add((Object)null);
        ((ArrayList) term2905).add((Object)null);
        ((ArrayList) term2905).add((Object)null);
        ((ArrayList) term2905).add((Object)null);
        ((ArrayList) term2905).add((Object)null);
        ((ArrayList) term2905).add((Object)null);
        ((ArrayList) term2905).add((Object)null);
        LinkedHashMap term2910 = new LinkedHashMap();
        term2863 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2864 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2909 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2864, term2864.getClass(), "tagName", "PsqusYmejD");
        setBooleanField(term2864, term2864.getClass(), "isBlock", true);
        setBooleanField(term2864, term2864.getClass(), "formatAsBlock", true);
        setBooleanField(term2864, term2864.getClass(), "canContainBlock", true);
        setBooleanField(term2864, term2864.getClass(), "canContainInline", false);
        setBooleanField(term2864, term2864.getClass(), "empty", false);
        setBooleanField(term2864, term2864.getClass(), "selfClosing", false);
        setBooleanField(term2864, term2864.getClass(), "preserveWhitespace", true);
        setBooleanField(term2864, term2864.getClass(), "formList", true);
        setBooleanField(term2864, term2864.getClass(), "formSubmit", false);
        setField(term2863, term2863.getClass(), "tag", term2864);
        setField(term2863, term2863.getClass(), "classNames", term2886);
        setField(term2863, term2863.getClass(), "parentNode", null);
        setField(term2863, term2863.getClass(), "childNodes", term2905);
        setField(term2909, term2909.getClass(), "attributes", term2910);
        setField(term2863, term2863.getClass(), "attributes", term2909);
        setField(term2863, term2863.getClass(), "baseUri", "wdoqITnaAP");
        setIntField(term2863, term2863.getClass(), "siblingIndex", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rIPMBcrNqB";
        try {
            callMethod(klass, "wrap", argTypes, term2863, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


