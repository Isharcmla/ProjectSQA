package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class CommandLineRunner_createExterns_185043600245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79523;
     Object term79929;

    public CommandLineRunner_createExterns_185043600245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79523 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term79629 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term79737 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierOfInstance"));
        Object term79775 = newInstance(Class.forName("java.lang.Object"));
        Object term79885 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner$Flags"));
        setBooleanField(term79523, term79523.getClass(), "testMode", true);
        setBooleanField(term79629, term79629.getClass(), "initialized", false);
        setField(term79737, term79737.getClass(), "instance", null);
        setField(term79629, term79629.getClass(), "delegate", term79737);
        setField(term79629, term79629.getClass(), "value", term79775);
        setField(term79523, term79523.getClass(), "externsSupplierForTesting", term79629);
        setField(term79523, term79523.getClass(), "flags", term79885);
        term79929 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term79930 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner$Flags"));
        Object term79931 = newInstance(Class.forName("com.google.common.base.Suppliers$MemoizingSupplier"));
        Object term79932 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierOfInstance"));
        setBooleanField(term79930, term79930.getClass(), "display_help", false);
        setBooleanField(term79930, term79930.getClass(), "print_tree", false);
        setBooleanField(term79930, term79930.getClass(), "compute_phase_ordering", false);
        setBooleanField(term79930, term79930.getClass(), "print_ast", false);
        setBooleanField(term79930, term79930.getClass(), "print_pass_graph", false);
        setField(term79930, term79930.getClass(), "jscomp_dev_mode", null);
        setField(term79930, term79930.getClass(), "logging_level", null);
        setField(term79930, term79930.getClass(), "externs", null);
        setField(term79930, term79930.getClass(), "js", null);
        setField(term79930, term79930.getClass(), "js_output_file", null);
        setField(term79930, term79930.getClass(), "module", null);
        setField(term79930, term79930.getClass(), "variable_map_input_file", null);
        setField(term79930, term79930.getClass(), "property_map_input_file", null);
        setField(term79930, term79930.getClass(), "variable_map_output_file", null);
        setBooleanField(term79930, term79930.getClass(), "create_name_map_files", false);
        setField(term79930, term79930.getClass(), "property_map_output_file", null);
        setBooleanField(term79930, term79930.getClass(), "third_party", false);
        setIntField(term79930, term79930.getClass(), "summary_detail_level", 0);
        setField(term79930, term79930.getClass(), "output_wrapper", null);
        setField(term79930, term79930.getClass(), "output_wrapper_marker", null);
        setField(term79930, term79930.getClass(), "module_wrapper", null);
        setField(term79930, term79930.getClass(), "module_output_path_prefix", null);
        setField(term79930, term79930.getClass(), "create_source_map", null);
        setField(term79930, term79930.getClass(), "jscomp_error", null);
        setField(term79930, term79930.getClass(), "jscomp_warning", null);
        setField(term79930, term79930.getClass(), "jscomp_off", null);
        setField(term79930, term79930.getClass(), "define", null);
        setField(term79930, term79930.getClass(), "charset", null);
        setField(term79930, term79930.getClass(), "compilation_level", null);
        setField(term79930, term79930.getClass(), "warning_level", null);
        setBooleanField(term79930, term79930.getClass(), "use_only_custom_externs", false);
        setBooleanField(term79930, term79930.getClass(), "debug", false);
        setField(term79930, term79930.getClass(), "formatting", null);
        setBooleanField(term79930, term79930.getClass(), "process_closure_primitives", false);
        setBooleanField(term79930, term79930.getClass(), "manage_closure_dependencies", false);
        setField(term79930, term79930.getClass(), "output_manifest", null);
        setField(term79929, term79929.getClass(), "flags", term79930);
        setBooleanField(term79929, term79929.getClass(), "isConfigValid", false);
        setField(term79929, term79929.getClass(), "config", null);
        setField(term79929, term79929.getClass(), "out", null);
        setField(term79929, term79929.getClass(), "err", null);
        setField(term79929, term79929.getClass(), "compiler", null);
        setField(term79929, term79929.getClass(), "inputCharset", null);
        setField(term79929, term79929.getClass(), "outputCharset", null);
        setBooleanField(term79929, term79929.getClass(), "testMode", true);
        setField(term79932, term79932.getClass(), "instance", null);
        setField(term79931, term79931.getClass(), "delegate", term79932);
        setBooleanField(term79931, term79931.getClass(), "initialized", true);
        setField(term79931, term79931.getClass(), "value", null);
        setField(term79929, term79929.getClass(), "externsSupplierForTesting", term79931);
        setField(term79929, term79929.getClass(), "inputsSupplierForTesting", null);
        setField(term79929, term79929.getClass(), "modulesSupplierForTesting", null);
        setField(term79929, term79929.getClass(), "exitCodeReceiverForTesting", null);
        setField(term79929, term79929.getClass(), "runTimeStats", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createExterns", argTypes, term79523, args);
        assertTrue(recursiveEquals(term79523, term79929));
        assertTrue(recursiveEquals(retValue, null));
    }

};


