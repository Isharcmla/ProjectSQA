package org.apache.commons.cli;

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
import java.lang.NullPointerException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.util.Collection;
import java.util.Iterator;

public class OptionGroup_toString_126656942235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5131;

    public OptionGroup_toString_126656942235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5360 = new HashMap();
        Collection<Object> term5307_OuterSet = ((HashMap) term5360).values();
        Iterator term5307 =  ((Collection) term5307_OuterSet).iterator();
        HashMap term5179 = new HashMap();
        ((HashMap) term5179).put((Object)null, (Object)null);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        ((HashMap) term5179).put(term5307, term5307);
        term5131 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term5131, term5131.getClass(), "optionMap", term5179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term5131, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


