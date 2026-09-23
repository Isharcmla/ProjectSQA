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

public class Element_data_121026680789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6837;

    public Element_data_121026680789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6863 = new ArrayList();
        ((ArrayList) term6863).add((Object)null);
        ((ArrayList) term6863).add((Object)null);
        ((ArrayList) term6863).add((Object)null);
        ((ArrayList) term6863).add((Object)null);
        ((ArrayList) term6863).add((Object)null);
        term6837 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6838 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6859 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6860 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6861 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6867 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6869 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6870 = (Object[]) newArray("java.lang.String", 0);
        setField(term6838, term6838.getClass(), "tagName", "CFyoseFGLF");
        setBooleanField(term6838, term6838.getClass(), "isBlock", true);
        setBooleanField(term6838, term6838.getClass(), "formatAsBlock", false);
        setBooleanField(term6838, term6838.getClass(), "canContainInline", true);
        setBooleanField(term6838, term6838.getClass(), "empty", false);
        setBooleanField(term6838, term6838.getClass(), "selfClosing", false);
        setBooleanField(term6838, term6838.getClass(), "preserveWhitespace", true);
        setBooleanField(term6838, term6838.getClass(), "formList", false);
        setBooleanField(term6838, term6838.getClass(), "formSubmit", false);
        setField(term6837, term6837.getClass(), "tag", term6838);
        setField(term6859, term6859.getClass(), "referent", null);
        setField(term6860, term6860.getClass(), "lock", term6861);
        setField(term6860, term6860.getClass(), "head", null);
        setLongField(term6860, term6860.getClass(), "queueLength", -1983291584002806658L);
        setField(term6859, term6859.getClass(), "queue", term6860);
        setField(term6859, term6859.getClass(), "next", null);
        setField(term6859, term6859.getClass(), "discovered", null);
        setField(term6837, term6837.getClass(), "shadowChildrenRef", term6859);
        setField(term6837, term6837.getClass(), "childNodes", term6863);
        setIntField(term6867, term6867.getClass(), "size", -1254072822);
        setField(term6867, term6867.getClass(), "keys", term6869);
        setField(term6867, term6867.getClass(), "vals", term6870);
        setField(term6837, term6837.getClass(), "attributes", term6867);
        setField(term6837, term6837.getClass(), "baseUri", "SFqCrhEWLm");
        setField(term6837, term6837.getClass(), "parentNode", null);
        setIntField(term6837, term6837.getClass(), "siblingIndex", -1111249833);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "data", argTypes, term6837, args);
    }

};


