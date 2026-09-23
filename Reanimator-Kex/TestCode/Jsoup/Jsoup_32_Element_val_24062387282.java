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

public class Element_val_24062387282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8044;

    public Element_val_24062387282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8066 = new HashMap();
        Set<Object> term8121 =  ((Map) term8066).keySet();
        HashSet term8065 = new HashSet((Collection<? extends Object>) term8121);
        ArrayList term8082 = new ArrayList();
        ((ArrayList) term8082).add((Object)null);
        LinkedHashMap term8087 = new LinkedHashMap();
        term8044 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8045 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8086 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8045, term8045.getClass(), "tagName", "vuIJRrypuA");
        setBooleanField(term8045, term8045.getClass(), "isBlock", false);
        setBooleanField(term8045, term8045.getClass(), "formatAsBlock", false);
        setBooleanField(term8045, term8045.getClass(), "canContainBlock", false);
        setBooleanField(term8045, term8045.getClass(), "canContainInline", true);
        setBooleanField(term8045, term8045.getClass(), "empty", true);
        setBooleanField(term8045, term8045.getClass(), "selfClosing", false);
        setBooleanField(term8045, term8045.getClass(), "preserveWhitespace", false);
        setField(term8044, term8044.getClass(), "tag", term8045);
        setField(term8044, term8044.getClass(), "classNames", term8065);
        setField(term8044, term8044.getClass(), "parentNode", null);
        setField(term8044, term8044.getClass(), "childNodes", term8082);
        setField(term8086, term8086.getClass(), "attributes", term8087);
        setField(term8044, term8044.getClass(), "attributes", term8086);
        setField(term8044, term8044.getClass(), "baseUri", "yQUDyOroXU");
        setIntField(term8044, term8044.getClass(), "siblingIndex", 663292551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "val", argTypes, term8044, args);
    }

};


