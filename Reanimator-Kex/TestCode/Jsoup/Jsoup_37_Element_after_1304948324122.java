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
import java.lang.IllegalArgumentException;
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

public class Element_after_1304948324122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2679;

    public Element_after_1304948324122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2703 = new HashMap();
        Set<Object> term19048 =  ((Map) term2703).keySet();
        HashSet term2702 = new HashSet((Collection<? extends Object>) term19048);
        ArrayList term2719 = new ArrayList();
        ((ArrayList) term2719).add((Object)null);
        ((ArrayList) term2719).add((Object)null);
        LinkedHashMap term2724 = new LinkedHashMap();
        term2679 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2680 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2723 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2680, term2680.getClass(), "tagName", "FjOiNAfBOc");
        setBooleanField(term2680, term2680.getClass(), "isBlock", false);
        setBooleanField(term2680, term2680.getClass(), "formatAsBlock", true);
        setBooleanField(term2680, term2680.getClass(), "canContainBlock", true);
        setBooleanField(term2680, term2680.getClass(), "canContainInline", false);
        setBooleanField(term2680, term2680.getClass(), "empty", false);
        setBooleanField(term2680, term2680.getClass(), "selfClosing", false);
        setBooleanField(term2680, term2680.getClass(), "preserveWhitespace", false);
        setBooleanField(term2680, term2680.getClass(), "formList", false);
        setBooleanField(term2680, term2680.getClass(), "formSubmit", false);
        setField(term2679, term2679.getClass(), "tag", term2680);
        setField(term2679, term2679.getClass(), "classNames", term2702);
        setField(term2679, term2679.getClass(), "parentNode", null);
        setField(term2679, term2679.getClass(), "childNodes", term2719);
        setField(term2723, term2723.getClass(), "attributes", term2724);
        setField(term2679, term2679.getClass(), "attributes", term2723);
        setField(term2679, term2679.getClass(), "baseUri", "EKjQdtKxAM");
        setIntField(term2679, term2679.getClass(), "siblingIndex", -203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "after", argTypes, term2679, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


