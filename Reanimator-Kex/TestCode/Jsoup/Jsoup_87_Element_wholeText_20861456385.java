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

public class Element_wholeText_20861456385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6657;

    public Element_wholeText_20861456385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6683 = new ArrayList();
        ((ArrayList) term6683).add((Object)null);
        ((ArrayList) term6683).add((Object)null);
        ((ArrayList) term6683).add((Object)null);
        ((ArrayList) term6683).add((Object)null);
        ((ArrayList) term6683).add((Object)null);
        ((ArrayList) term6683).add((Object)null);
        ((ArrayList) term6683).add((Object)null);
        term6657 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6658 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6679 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6680 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6681 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6687 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6689 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6690 = (Object[]) newArray("java.lang.String", 0);
        setField(term6658, term6658.getClass(), "tagName", "NnpwZBUTvx");
        setBooleanField(term6658, term6658.getClass(), "isBlock", false);
        setBooleanField(term6658, term6658.getClass(), "formatAsBlock", true);
        setBooleanField(term6658, term6658.getClass(), "canContainInline", true);
        setBooleanField(term6658, term6658.getClass(), "empty", true);
        setBooleanField(term6658, term6658.getClass(), "selfClosing", false);
        setBooleanField(term6658, term6658.getClass(), "preserveWhitespace", true);
        setBooleanField(term6658, term6658.getClass(), "formList", true);
        setBooleanField(term6658, term6658.getClass(), "formSubmit", true);
        setField(term6657, term6657.getClass(), "tag", term6658);
        setField(term6679, term6679.getClass(), "referent", null);
        setField(term6680, term6680.getClass(), "lock", term6681);
        setField(term6680, term6680.getClass(), "head", null);
        setLongField(term6680, term6680.getClass(), "queueLength", 5510783420697225605L);
        setField(term6679, term6679.getClass(), "queue", term6680);
        setField(term6679, term6679.getClass(), "next", null);
        setField(term6679, term6679.getClass(), "discovered", null);
        setField(term6657, term6657.getClass(), "shadowChildrenRef", term6679);
        setField(term6657, term6657.getClass(), "childNodes", term6683);
        setIntField(term6687, term6687.getClass(), "size", 2049577015);
        setField(term6687, term6687.getClass(), "keys", term6689);
        setField(term6687, term6687.getClass(), "vals", term6690);
        setField(term6657, term6657.getClass(), "attributes", term6687);
        setField(term6657, term6657.getClass(), "baseUri", "tlQSNgTkQX");
        setField(term6657, term6657.getClass(), "parentNode", null);
        setIntField(term6657, term6657.getClass(), "siblingIndex", 1236004505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "wholeText", argTypes, term6657, args);
    }

};


