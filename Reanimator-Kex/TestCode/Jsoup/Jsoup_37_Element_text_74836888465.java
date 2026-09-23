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

public class Element_text_74836888465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6385;

    public Element_text_74836888465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6409 = new HashMap();
        Set<Object> term6470 =  ((Map) term6409).keySet();
        HashSet term6408 = new HashSet((Collection<? extends Object>) term6470);
        ArrayList term6431 = new ArrayList();
        LinkedHashMap term6436 = new LinkedHashMap();
        term6385 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6386 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6435 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6386, term6386.getClass(), "tagName", "PsMKIIEwdR");
        setBooleanField(term6386, term6386.getClass(), "isBlock", false);
        setBooleanField(term6386, term6386.getClass(), "formatAsBlock", false);
        setBooleanField(term6386, term6386.getClass(), "canContainBlock", true);
        setBooleanField(term6386, term6386.getClass(), "canContainInline", true);
        setBooleanField(term6386, term6386.getClass(), "empty", true);
        setBooleanField(term6386, term6386.getClass(), "selfClosing", true);
        setBooleanField(term6386, term6386.getClass(), "preserveWhitespace", false);
        setBooleanField(term6386, term6386.getClass(), "formList", false);
        setBooleanField(term6386, term6386.getClass(), "formSubmit", false);
        setField(term6385, term6385.getClass(), "tag", term6386);
        setField(term6385, term6385.getClass(), "classNames", term6408);
        setField(term6385, term6385.getClass(), "parentNode", null);
        setField(term6385, term6385.getClass(), "childNodes", term6431);
        setField(term6435, term6435.getClass(), "attributes", term6436);
        setField(term6385, term6385.getClass(), "attributes", term6435);
        setField(term6385, term6385.getClass(), "baseUri", "EBYHwsuWAU");
        setIntField(term6385, term6385.getClass(), "siblingIndex", -1388471422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "text", argTypes, term6385, args);
    }

};


