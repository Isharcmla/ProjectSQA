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

public class Element_classNames_38379742576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7372;
     Object term7435;

    public Element_classNames_38379742576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7396 = new HashMap();
        Set<Object> term7456 =  ((Map) term7396).keySet();
        HashSet term7395 = new HashSet((Collection<? extends Object>) term7456);
        ArrayList term7406 = new ArrayList();
        LinkedHashMap term7411 = new LinkedHashMap();
        term7372 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7373 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7410 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7373, term7373.getClass(), "tagName", "ktKcSZiuGM");
        setBooleanField(term7373, term7373.getClass(), "isBlock", false);
        setBooleanField(term7373, term7373.getClass(), "formatAsBlock", true);
        setBooleanField(term7373, term7373.getClass(), "canContainBlock", false);
        setBooleanField(term7373, term7373.getClass(), "canContainInline", false);
        setBooleanField(term7373, term7373.getClass(), "empty", false);
        setBooleanField(term7373, term7373.getClass(), "selfClosing", true);
        setBooleanField(term7373, term7373.getClass(), "preserveWhitespace", false);
        setBooleanField(term7373, term7373.getClass(), "formList", true);
        setBooleanField(term7373, term7373.getClass(), "formSubmit", true);
        setField(term7372, term7372.getClass(), "tag", term7373);
        setField(term7372, term7372.getClass(), "classNames", term7395);
        setField(term7372, term7372.getClass(), "parentNode", null);
        setField(term7372, term7372.getClass(), "childNodes", term7406);
        setField(term7410, term7410.getClass(), "attributes", term7411);
        setField(term7372, term7372.getClass(), "attributes", term7410);
        setField(term7372, term7372.getClass(), "baseUri", "iQiGTulJiH");
        setIntField(term7372, term7372.getClass(), "siblingIndex", -243422082);
        HashMap term7436 = new HashMap();
        Set<Object> term7467 =  ((Map) term7436).keySet();
        term7435 = new HashSet((Collection<? extends Object>) term7467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term7435;
        callMethod(klass, "classNames", argTypes, term7372, args);
    }

};


