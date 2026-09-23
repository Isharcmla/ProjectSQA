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

public class Element_val_24062387281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8096;

    public Element_val_24062387281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8118 = new HashMap();
        Set<Object> term8173 =  ((Map) term8118).keySet();
        HashSet term8117 = new HashSet((Collection<? extends Object>) term8173);
        ArrayList term8134 = new ArrayList();
        ((ArrayList) term8134).add((Object)null);
        LinkedHashMap term8139 = new LinkedHashMap();
        term8096 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8097 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8138 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8097, term8097.getClass(), "tagName", "vuIJRrypuA");
        setBooleanField(term8097, term8097.getClass(), "isBlock", false);
        setBooleanField(term8097, term8097.getClass(), "formatAsBlock", false);
        setBooleanField(term8097, term8097.getClass(), "canContainBlock", false);
        setBooleanField(term8097, term8097.getClass(), "canContainInline", true);
        setBooleanField(term8097, term8097.getClass(), "empty", true);
        setBooleanField(term8097, term8097.getClass(), "selfClosing", false);
        setBooleanField(term8097, term8097.getClass(), "preserveWhitespace", false);
        setField(term8096, term8096.getClass(), "tag", term8097);
        setField(term8096, term8096.getClass(), "classNames", term8117);
        setField(term8096, term8096.getClass(), "parentNode", null);
        setField(term8096, term8096.getClass(), "childNodes", term8134);
        setField(term8138, term8138.getClass(), "attributes", term8139);
        setField(term8096, term8096.getClass(), "attributes", term8138);
        setField(term8096, term8096.getClass(), "baseUri", "yQUDyOroXU");
        setIntField(term8096, term8096.getClass(), "siblingIndex", -601863069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "val", argTypes, term8096, args);
    }

};


