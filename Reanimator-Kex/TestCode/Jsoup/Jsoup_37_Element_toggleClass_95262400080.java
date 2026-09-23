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

public class Element_toggleClass_95262400080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7794;

    public Element_toggleClass_95262400080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7818 = new HashMap();
        Set<Object> term7885 =  ((Map) term7818).keySet();
        HashSet term7817 = new HashSet((Collection<? extends Object>) term7885);
        ArrayList term7834 = new ArrayList();
        ((ArrayList) term7834).add((Object)null);
        ((ArrayList) term7834).add((Object)null);
        ((ArrayList) term7834).add((Object)null);
        LinkedHashMap term7839 = new LinkedHashMap();
        term7794 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7795 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7838 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7795, term7795.getClass(), "tagName", "gFUWMydGCU");
        setBooleanField(term7795, term7795.getClass(), "isBlock", true);
        setBooleanField(term7795, term7795.getClass(), "formatAsBlock", true);
        setBooleanField(term7795, term7795.getClass(), "canContainBlock", false);
        setBooleanField(term7795, term7795.getClass(), "canContainInline", false);
        setBooleanField(term7795, term7795.getClass(), "empty", true);
        setBooleanField(term7795, term7795.getClass(), "selfClosing", true);
        setBooleanField(term7795, term7795.getClass(), "preserveWhitespace", true);
        setBooleanField(term7795, term7795.getClass(), "formList", false);
        setBooleanField(term7795, term7795.getClass(), "formSubmit", true);
        setField(term7794, term7794.getClass(), "tag", term7795);
        setField(term7794, term7794.getClass(), "classNames", term7817);
        setField(term7794, term7794.getClass(), "parentNode", null);
        setField(term7794, term7794.getClass(), "childNodes", term7834);
        setField(term7838, term7838.getClass(), "attributes", term7839);
        setField(term7794, term7794.getClass(), "attributes", term7838);
        setField(term7794, term7794.getClass(), "baseUri", "YupgKTSEiI");
        setIntField(term7794, term7794.getClass(), "siblingIndex", 1296895584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HuOUlaFmvJ";
        callMethod(klass, "toggleClass", argTypes, term7794, args);
    }

};


