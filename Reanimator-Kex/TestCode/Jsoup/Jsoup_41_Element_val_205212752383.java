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
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_val_205212752383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6944;

    public Element_val_205212752383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6967 = new ArrayList();
        ((ArrayList) term6967).add((Object)null);
        ((ArrayList) term6967).add((Object)null);
        LinkedHashMap term6972 = new LinkedHashMap();
        term6944 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6945 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6971 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6945, term6945.getClass(), "tagName", "WdCiTDUKqn");
        setBooleanField(term6945, term6945.getClass(), "isBlock", false);
        setBooleanField(term6945, term6945.getClass(), "formatAsBlock", false);
        setBooleanField(term6945, term6945.getClass(), "canContainBlock", false);
        setBooleanField(term6945, term6945.getClass(), "canContainInline", false);
        setBooleanField(term6945, term6945.getClass(), "empty", false);
        setBooleanField(term6945, term6945.getClass(), "selfClosing", true);
        setBooleanField(term6945, term6945.getClass(), "preserveWhitespace", false);
        setBooleanField(term6945, term6945.getClass(), "formList", false);
        setBooleanField(term6945, term6945.getClass(), "formSubmit", true);
        setField(term6944, term6944.getClass(), "tag", term6945);
        setField(term6944, term6944.getClass(), "parentNode", null);
        setField(term6944, term6944.getClass(), "childNodes", term6967);
        setField(term6971, term6971.getClass(), "attributes", term6972);
        setField(term6944, term6944.getClass(), "attributes", term6971);
        setField(term6944, term6944.getClass(), "baseUri", "yevIIoVYHq");
        setIntField(term6944, term6944.getClass(), "siblingIndex", 229204365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UuYWMTqWTV";
        callMethod(klass, "val", argTypes, term6944, args);
    }

};


