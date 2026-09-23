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

public class Element_getElementsByAttributeValue_183258710064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4655;

    public Element_getElementsByAttributeValue_183258710064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4681 = new ArrayList();
        term4655 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4656 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4677 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4678 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4679 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4685 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4687 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4688 = (Object[]) newArray("java.lang.String", 0);
        setField(term4656, term4656.getClass(), "tagName", "ZfdXfCCFDf");
        setBooleanField(term4656, term4656.getClass(), "isBlock", true);
        setBooleanField(term4656, term4656.getClass(), "formatAsBlock", true);
        setBooleanField(term4656, term4656.getClass(), "canContainInline", false);
        setBooleanField(term4656, term4656.getClass(), "empty", false);
        setBooleanField(term4656, term4656.getClass(), "selfClosing", false);
        setBooleanField(term4656, term4656.getClass(), "preserveWhitespace", false);
        setBooleanField(term4656, term4656.getClass(), "formList", true);
        setBooleanField(term4656, term4656.getClass(), "formSubmit", false);
        setField(term4655, term4655.getClass(), "tag", term4656);
        setField(term4677, term4677.getClass(), "referent", null);
        setField(term4678, term4678.getClass(), "lock", term4679);
        setField(term4678, term4678.getClass(), "head", null);
        setLongField(term4678, term4678.getClass(), "queueLength", 2443640364875054177L);
        setField(term4677, term4677.getClass(), "queue", term4678);
        setField(term4677, term4677.getClass(), "next", null);
        setField(term4677, term4677.getClass(), "discovered", null);
        setField(term4655, term4655.getClass(), "shadowChildrenRef", term4677);
        setField(term4655, term4655.getClass(), "childNodes", term4681);
        setIntField(term4685, term4685.getClass(), "size", 480137250);
        setField(term4685, term4685.getClass(), "keys", term4687);
        setField(term4685, term4685.getClass(), "vals", term4688);
        setField(term4655, term4655.getClass(), "attributes", term4685);
        setField(term4655, term4655.getClass(), "baseUri", "MwwjNtdOFT");
        setField(term4655, term4655.getClass(), "parentNode", null);
        setIntField(term4655, term4655.getClass(), "siblingIndex", -341152642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "VYkqXKVlAJ";
        args[1] = "XkIoWJRNwN";
        callMethod(klass, "getElementsByAttributeValue", argTypes, term4655, args);
    }

};


