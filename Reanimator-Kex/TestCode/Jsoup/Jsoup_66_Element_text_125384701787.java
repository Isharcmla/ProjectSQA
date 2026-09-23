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

public class Element_text_125384701787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6681;

    public Element_text_125384701787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6707 = new ArrayList();
        ((ArrayList) term6707).add((Object)null);
        ((ArrayList) term6707).add((Object)null);
        ((ArrayList) term6707).add((Object)null);
        ((ArrayList) term6707).add((Object)null);
        ((ArrayList) term6707).add((Object)null);
        ((ArrayList) term6707).add((Object)null);
        ((ArrayList) term6707).add((Object)null);
        term6681 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6682 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6703 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6704 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6705 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6711 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6713 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6714 = (Object[]) newArray("java.lang.String", 0);
        setField(term6682, term6682.getClass(), "tagName", "NnpwZBUTvx");
        setBooleanField(term6682, term6682.getClass(), "isBlock", true);
        setBooleanField(term6682, term6682.getClass(), "formatAsBlock", false);
        setBooleanField(term6682, term6682.getClass(), "canContainInline", true);
        setBooleanField(term6682, term6682.getClass(), "empty", true);
        setBooleanField(term6682, term6682.getClass(), "selfClosing", true);
        setBooleanField(term6682, term6682.getClass(), "preserveWhitespace", false);
        setBooleanField(term6682, term6682.getClass(), "formList", true);
        setBooleanField(term6682, term6682.getClass(), "formSubmit", true);
        setField(term6681, term6681.getClass(), "tag", term6682);
        setField(term6703, term6703.getClass(), "referent", null);
        setField(term6704, term6704.getClass(), "lock", term6705);
        setField(term6704, term6704.getClass(), "head", null);
        setLongField(term6704, term6704.getClass(), "queueLength", 5510783420697225605L);
        setField(term6703, term6703.getClass(), "queue", term6704);
        setField(term6703, term6703.getClass(), "next", null);
        setField(term6703, term6703.getClass(), "discovered", null);
        setField(term6681, term6681.getClass(), "shadowChildrenRef", term6703);
        setField(term6681, term6681.getClass(), "childNodes", term6707);
        setIntField(term6711, term6711.getClass(), "size", -1022990421);
        setField(term6711, term6711.getClass(), "keys", term6713);
        setField(term6711, term6711.getClass(), "vals", term6714);
        setField(term6681, term6681.getClass(), "attributes", term6711);
        setField(term6681, term6681.getClass(), "baseUri", "tlQSNgTkQX");
        setField(term6681, term6681.getClass(), "parentNode", null);
        setIntField(term6681, term6681.getClass(), "siblingIndex", 1045547089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PCipZnmBOF";
        callMethod(klass, "text", argTypes, term6681, args);
    }

};


