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

public class Element_preserveWhitespace_191041606770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7036;

    public Element_preserveWhitespace_191041606770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7058 = new HashMap();
        Set<Object> term7119 =  ((Map) term7058).keySet();
        HashSet term7057 = new HashSet((Collection<? extends Object>) term7119);
        ArrayList term7080 = new ArrayList();
        ((ArrayList) term7080).add((Object)null);
        ((ArrayList) term7080).add((Object)null);
        ((ArrayList) term7080).add((Object)null);
        ((ArrayList) term7080).add((Object)null);
        ((ArrayList) term7080).add((Object)null);
        LinkedHashMap term7085 = new LinkedHashMap();
        term7036 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7037 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7084 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7037, term7037.getClass(), "tagName", "DNOtiLPAIY");
        setBooleanField(term7037, term7037.getClass(), "isBlock", true);
        setBooleanField(term7037, term7037.getClass(), "formatAsBlock", false);
        setBooleanField(term7037, term7037.getClass(), "canContainBlock", false);
        setBooleanField(term7037, term7037.getClass(), "canContainInline", false);
        setBooleanField(term7037, term7037.getClass(), "empty", true);
        setBooleanField(term7037, term7037.getClass(), "selfClosing", false);
        setBooleanField(term7037, term7037.getClass(), "preserveWhitespace", true);
        setField(term7036, term7036.getClass(), "tag", term7037);
        setField(term7036, term7036.getClass(), "classNames", term7057);
        setField(term7036, term7036.getClass(), "parentNode", null);
        setField(term7036, term7036.getClass(), "childNodes", term7080);
        setField(term7084, term7084.getClass(), "attributes", term7085);
        setField(term7036, term7036.getClass(), "attributes", term7084);
        setField(term7036, term7036.getClass(), "baseUri", "tvxYdqiyGc");
        setIntField(term7036, term7036.getClass(), "siblingIndex", 1398204340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "preserveWhitespace", argTypes, term7036, args);
    }

};


