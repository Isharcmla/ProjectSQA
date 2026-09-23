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

public class Element_getElementsByAttribute_59926345642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3878;

    public Element_getElementsByAttribute_59926345642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3900 = new HashMap();
        Set<Object> term3965 =  ((Map) term3900).keySet();
        HashSet term3899 = new HashSet((Collection<? extends Object>) term3965);
        ArrayList term3914 = new ArrayList();
        ((ArrayList) term3914).add((Object)null);
        ((ArrayList) term3914).add((Object)null);
        ((ArrayList) term3914).add((Object)null);
        ((ArrayList) term3914).add((Object)null);
        ((ArrayList) term3914).add((Object)null);
        ((ArrayList) term3914).add((Object)null);
        ((ArrayList) term3914).add((Object)null);
        ((ArrayList) term3914).add((Object)null);
        ((ArrayList) term3914).add((Object)null);
        LinkedHashMap term3919 = new LinkedHashMap();
        term3878 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3879 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3918 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3879, term3879.getClass(), "tagName", "yeSXGqQExb");
        setBooleanField(term3879, term3879.getClass(), "isBlock", true);
        setBooleanField(term3879, term3879.getClass(), "formatAsBlock", true);
        setBooleanField(term3879, term3879.getClass(), "canContainBlock", true);
        setBooleanField(term3879, term3879.getClass(), "canContainInline", false);
        setBooleanField(term3879, term3879.getClass(), "empty", true);
        setBooleanField(term3879, term3879.getClass(), "selfClosing", false);
        setBooleanField(term3879, term3879.getClass(), "preserveWhitespace", false);
        setField(term3878, term3878.getClass(), "tag", term3879);
        setField(term3878, term3878.getClass(), "classNames", term3899);
        setField(term3878, term3878.getClass(), "parentNode", null);
        setField(term3878, term3878.getClass(), "childNodes", term3914);
        setField(term3918, term3918.getClass(), "attributes", term3919);
        setField(term3878, term3878.getClass(), "attributes", term3918);
        setField(term3878, term3878.getClass(), "baseUri", "EusenEbIoF");
        setIntField(term3878, term3878.getClass(), "siblingIndex", -602026508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SScVQYSvWH";
        callMethod(klass, "getElementsByAttribute", argTypes, term3878, args);
    }

};


