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

public class Element_hashCode_188061476390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8844;

    public Element_hashCode_188061476390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8868 = new HashMap();
        Set<Object> term8917 =  ((Map) term8868).keySet();
        HashSet term8867 = new HashSet((Collection<? extends Object>) term8917);
        ArrayList term8878 = new ArrayList();
        LinkedHashMap term8883 = new LinkedHashMap();
        term8844 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8845 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8882 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8845, term8845.getClass(), "tagName", "gYYKrIeThw");
        setBooleanField(term8845, term8845.getClass(), "isBlock", true);
        setBooleanField(term8845, term8845.getClass(), "formatAsBlock", false);
        setBooleanField(term8845, term8845.getClass(), "canContainBlock", false);
        setBooleanField(term8845, term8845.getClass(), "canContainInline", true);
        setBooleanField(term8845, term8845.getClass(), "empty", true);
        setBooleanField(term8845, term8845.getClass(), "selfClosing", false);
        setBooleanField(term8845, term8845.getClass(), "preserveWhitespace", false);
        setBooleanField(term8845, term8845.getClass(), "formList", false);
        setBooleanField(term8845, term8845.getClass(), "formSubmit", false);
        setField(term8844, term8844.getClass(), "tag", term8845);
        setField(term8844, term8844.getClass(), "classNames", term8867);
        setField(term8844, term8844.getClass(), "parentNode", null);
        setField(term8844, term8844.getClass(), "childNodes", term8878);
        setField(term8882, term8882.getClass(), "attributes", term8883);
        setField(term8844, term8844.getClass(), "attributes", term8882);
        setField(term8844, term8844.getClass(), "baseUri", "wIuJvIvEMb");
        setIntField(term8844, term8844.getClass(), "siblingIndex", -1970452551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term8844, args);
    }

};


