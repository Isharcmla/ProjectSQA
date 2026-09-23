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

public class Element_getElementsByAttributeValueMatching_150212723351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4981;

    public Element_getElementsByAttributeValueMatching_150212723351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5003 = new HashMap();
        Set<Object> term5071 =  ((Map) term5003).keySet();
        HashSet term5002 = new HashSet((Collection<? extends Object>) term5071);
        ArrayList term5008 = new ArrayList();
        ((ArrayList) term5008).add((Object)null);
        LinkedHashMap term5013 = new LinkedHashMap();
        term4981 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4982 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5012 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4982, term4982.getClass(), "tagName", "ZUdnQXfzCI");
        setBooleanField(term4982, term4982.getClass(), "isBlock", false);
        setBooleanField(term4982, term4982.getClass(), "formatAsBlock", true);
        setBooleanField(term4982, term4982.getClass(), "canContainBlock", true);
        setBooleanField(term4982, term4982.getClass(), "canContainInline", true);
        setBooleanField(term4982, term4982.getClass(), "empty", false);
        setBooleanField(term4982, term4982.getClass(), "selfClosing", true);
        setBooleanField(term4982, term4982.getClass(), "preserveWhitespace", true);
        setField(term4981, term4981.getClass(), "tag", term4982);
        setField(term4981, term4981.getClass(), "classNames", term5002);
        setField(term4981, term4981.getClass(), "parentNode", null);
        setField(term4981, term4981.getClass(), "childNodes", term5008);
        setField(term5012, term5012.getClass(), "attributes", term5013);
        setField(term4981, term4981.getClass(), "attributes", term5012);
        setField(term4981, term4981.getClass(), "baseUri", "bycpZjxXFn");
        setIntField(term4981, term4981.getClass(), "siblingIndex", 1540719661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "jQWttOAiwL";
        args[1] = "DzKFxEuEEC";
        callMethod(klass, "getElementsByAttributeValueMatching", argTypes, term4981, args);
    }

};


