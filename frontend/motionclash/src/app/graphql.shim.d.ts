declare module 'graphql/error/GraphQLError' {
  // tslint:disable-next-line:no-empty-interface
  export interface GraphQLError{}
}

declare module 'graphql/language/ast' {
  // tslint:disable-next-line:no-empty-interface
  export interface DocumentNode{}
}

declare module 'global' {
  const window: Window;
  const document: Document;
}