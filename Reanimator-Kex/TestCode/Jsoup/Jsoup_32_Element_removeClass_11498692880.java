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

public class Element_removeClass_11498692880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7830;

    public Element_removeClass_11498692880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7852 = new HashMap();
        Set<Object> term7919 =  ((Map) term7852).keySet();
        HashSet term7851 = new HashSet((Collection<? extends Object>) term7919);
        ArrayList term7868 = new ArrayList();
        ((ArrayList) term7868).add((Object)null);
        LinkedHashMap term7873 = new LinkedHashMap();
        term7830 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7831 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7872 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7831, term7831.getClass(), "tagName", "eWnrMSbYbT");
        setBooleanField(term7831, term7831.getClass(), "isBlock", true);
        setBooleanField(term7831, term7831.getClass(), "formatAsBlock", true);
        setBooleanField(term7831, term7831.getClass(), "canContainBlock", true);
        setBooleanField(term7831, term7831.getClass(), "canContainInline", false);
        setBooleanField(term7831, term7831.getClass(), "empty", false);
        setBooleanField(term7831, term7831.getClass(), "selfClosing", false);
        setBooleanField(term7831, term7831.getClass(), "preserveWhitespace", false);
        setField(term7830, term7830.getClass(), "tag", term7831);
        setField(term7830, term7830.getClass(), "classNames", term7851);
        setField(term7830, term7830.getClass(), "parentNode", null);
        setField(term7830, term7830.getClass(), "childNodes", term7868);
        setField(term7872, term7872.getClass(), "attributes", term7873);
        setField(term7830, term7830.getClass(), "attributes", term7872);
        setField(term7830, term7830.getClass(), "baseUri", "QTefjRuiez");
        setIntField(term7830, term7830.getClass(), "siblingIndex", 1041916673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SQZVNkAVBB";
        callMethod(klass, "removeClass", argTypes, term7830, args);
    }

};


