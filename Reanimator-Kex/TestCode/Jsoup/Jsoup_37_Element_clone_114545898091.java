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

public class Element_clone_114545898091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8928;

    public Element_clone_114545898091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8952 = new HashMap();
        Set<Object> term9011 =  ((Map) term8952).keySet();
        HashSet term8951 = new HashSet((Collection<? extends Object>) term9011);
        ArrayList term8972 = new ArrayList();
        ((ArrayList) term8972).add((Object)null);
        ((ArrayList) term8972).add((Object)null);
        ((ArrayList) term8972).add((Object)null);
        ((ArrayList) term8972).add((Object)null);
        ((ArrayList) term8972).add((Object)null);
        LinkedHashMap term8977 = new LinkedHashMap();
        term8928 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8929 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8976 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8929, term8929.getClass(), "tagName", "EyojsbSjWT");
        setBooleanField(term8929, term8929.getClass(), "isBlock", true);
        setBooleanField(term8929, term8929.getClass(), "formatAsBlock", true);
        setBooleanField(term8929, term8929.getClass(), "canContainBlock", false);
        setBooleanField(term8929, term8929.getClass(), "canContainInline", true);
        setBooleanField(term8929, term8929.getClass(), "empty", false);
        setBooleanField(term8929, term8929.getClass(), "selfClosing", true);
        setBooleanField(term8929, term8929.getClass(), "preserveWhitespace", true);
        setBooleanField(term8929, term8929.getClass(), "formList", false);
        setBooleanField(term8929, term8929.getClass(), "formSubmit", true);
        setField(term8928, term8928.getClass(), "tag", term8929);
        setField(term8928, term8928.getClass(), "classNames", term8951);
        setField(term8928, term8928.getClass(), "parentNode", null);
        setField(term8928, term8928.getClass(), "childNodes", term8972);
        setField(term8976, term8976.getClass(), "attributes", term8977);
        setField(term8928, term8928.getClass(), "attributes", term8976);
        setField(term8928, term8928.getClass(), "baseUri", "FBCXbjHVXO");
        setIntField(term8928, term8928.getClass(), "siblingIndex", -1896376975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term8928, args);
    }

};


