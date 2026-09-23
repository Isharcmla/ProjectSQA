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

public class Element_toggleClass_952624000100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7734;

    public Element_toggleClass_952624000100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7760 = new ArrayList();
        ((ArrayList) term7760).add((Object)null);
        ((ArrayList) term7760).add((Object)null);
        ((ArrayList) term7760).add((Object)null);
        ((ArrayList) term7760).add((Object)null);
        ((ArrayList) term7760).add((Object)null);
        term7734 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7735 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7756 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7757 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7758 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7764 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7766 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7767 = (Object[]) newArray("java.lang.String", 0);
        setField(term7735, term7735.getClass(), "tagName", "PqtVXXZMqK");
        setBooleanField(term7735, term7735.getClass(), "isBlock", false);
        setBooleanField(term7735, term7735.getClass(), "formatAsBlock", false);
        setBooleanField(term7735, term7735.getClass(), "canContainInline", true);
        setBooleanField(term7735, term7735.getClass(), "empty", true);
        setBooleanField(term7735, term7735.getClass(), "selfClosing", false);
        setBooleanField(term7735, term7735.getClass(), "preserveWhitespace", false);
        setBooleanField(term7735, term7735.getClass(), "formList", false);
        setBooleanField(term7735, term7735.getClass(), "formSubmit", false);
        setField(term7734, term7734.getClass(), "tag", term7735);
        setField(term7756, term7756.getClass(), "referent", null);
        setField(term7757, term7757.getClass(), "lock", term7758);
        setField(term7757, term7757.getClass(), "head", null);
        setLongField(term7757, term7757.getClass(), "queueLength", -8463029266761149071L);
        setField(term7756, term7756.getClass(), "queue", term7757);
        setField(term7756, term7756.getClass(), "next", null);
        setField(term7756, term7756.getClass(), "discovered", null);
        setField(term7734, term7734.getClass(), "shadowChildrenRef", term7756);
        setField(term7734, term7734.getClass(), "childNodes", term7760);
        setIntField(term7764, term7764.getClass(), "size", 803925431);
        setField(term7764, term7764.getClass(), "keys", term7766);
        setField(term7764, term7764.getClass(), "vals", term7767);
        setField(term7734, term7734.getClass(), "attributes", term7764);
        setField(term7734, term7734.getClass(), "baseUri", "rYbtIDVdnd");
        setField(term7734, term7734.getClass(), "parentNode", null);
        setIntField(term7734, term7734.getClass(), "siblingIndex", 76929641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UKAReurpHG";
        callMethod(klass, "toggleClass", argTypes, term7734, args);
    }

};


